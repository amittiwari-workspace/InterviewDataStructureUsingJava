
public class EqualSumPartition {

    static boolean t[][];
    private static String sumOfSubsetDP(int set[],int sum,int n)
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
            return t[n][sum]== true?"true":"false";
    }

    public static void main(String[] args) {
    
        int arr[]=new int[]{2,5,11,5};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        t=new boolean[arr.length+1][sum+1];
        for (int i = 0; i <=arr.length; i++) {
            t[i][0]= true;
        }
        for (int j = 1; j <=sum/2; j++) {
            t[0][j]= false;
        }
        if(sum%2!=0) System.out.println("false");
        else 
        {
            System.out.println(sumOfSubsetDP(arr, sum/2, arr.length));
        }
    }

}