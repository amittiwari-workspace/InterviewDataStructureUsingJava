
public class SumOfSubsetDP {


    static boolean t[][];
    static int q[][];

    private static boolean sumOfSubsetRecursion(int set[],int sum,int n)
    {
        if(sum==0) return true;
        if(n==0) return false;

        if(set[n-1]<=sum)
        {
            return sumOfSubsetRecursion(set, sum-set[n-1], n-1) || sumOfSubsetRecursion(set, sum, n-1);
        }
        else
        {
            return sumOfSubsetRecursion(set, sum, n-1);
        }
    
    }

    private static int countNoOfSubsetSumRecursion(int set[],int sum,int n)
    {
        if(sum==0) return 1;
        if(n==0) return 0;

        if(set[n-1]<=sum)
        {
            return countNoOfSubsetSumRecursion(set, sum-set[n-1], n-1) 
            + countNoOfSubsetSumRecursion(set, sum, n-1);
        }
        else
        {
            return countNoOfSubsetSumRecursion(set, sum, n-1);
        }
    
    }


    private static boolean sumOfSubsetDP(int set[],int sum,int n)
    {
             for (int i = 1; i <=set.length; i++) {
                 for (int j = 1; j <=sum; j++) {
            
                    if(set[i-1]<=j)
                    {
                        t[i][j]=t[i-1][j-set[i-1]] || t[i-1][j];
                    }
                    else
                    {
                        t[i][j]=t[i-1][j];
                    }
                 }
                }
            return t[n][sum];
    }

    private static int countsumOfSubsetDP(int set[],int sum,int n)
    {
             for (int i = 1; i <=set.length; i++) {
                 for (int j = 1; j <=sum; j++) {
            
                    if(set[i-1]<=j)
                    {
                        q[i][j]=q[i-1][j-set[i-1]] + q[i-1][j];
                    }
                    else
                    {
                        q[i][j]=q[i-1][j];
                    }
                 }
                }
            return q[n][sum];
    }
    public static void main(String[] args) {
      
        int set[] = {10, 34, 4, 12, 5, 5};
        int sum = 10;

        System.out.println("Sum of Subset Present using Recursion " +sumOfSubsetRecursion(set, sum, set.length));
        System.out.println("Count no of Subset Sum Present using Recursion " +countNoOfSubsetSumRecursion(set, sum, set.length));

        t=new boolean[set.length+1][sum+1];
        for (int i = 0; i <=set.length; i++) {
            t[i][0]= true;
        }
        for (int j = 1; j <=sum; j++) {
            t[0][j]= false;
        }

        sum=9;
        q=new int[set.length+1][sum+1];
        for (int p = 0; p <=set.length; p++) {
            q[p][0]= 1;
        }
        for (int r = 1; r <=sum; r++) {
            q[0][r]= 0;
        }
        
        System.out.println("Sum of Subset Present using DP " +sumOfSubsetDP(set, sum, set.length));
        System.out.println("Count Sum of Subset Present using DP " +countsumOfSubsetDP(set, sum, set.length));


    }

}