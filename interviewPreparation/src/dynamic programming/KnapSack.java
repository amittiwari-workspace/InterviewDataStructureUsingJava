

import java.util.Arrays;

public class KnapSack
{
    static int t[][];
    static int q[][];

    private static int maximizeProfitRecursion(int val[],int wt[],int W,int n)
    {
        if( n==0 || W==0) return 0;

        if(wt[n-1]<=W)
        {
            return Math.max(val[n-1]+maximizeProfitRecursion(val,wt,W-wt[n-1],n-1),maximizeProfitRecursion(val,wt,W,n-1));
        }
        else return maximizeProfitRecursion(val,wt,W,n-1);
    }

    private static int maximizeProfitTopDownDP(int val[],int wt[],int W,int n)
    {
        if( n==0 || W==0) return 0;
        if(t[n][W]!=-1) return t[n][W];
        if(wt[n-1]<=W)
        {
            t[n][W]=Math.max(val[n-1]+maximizeProfitTopDownDP(val,wt,W-wt[n-1],n-1),maximizeProfitTopDownDP(val,wt,W,n-1));
        }
        else if(wt[n-1]>W)
        t[n][W]=maximizeProfitTopDownDP(val,wt,W,n-1);

        return t[n][W];
    }

    private static int maximizeProfitBottomUpDP(int val[],int wt[],int W,int n)
    {
        for (int i = 0; i <= wt.length; i++) {
            for (int j = 0; j <= W; j++) {
                
                if( i==0 || j==0) 
                    q[i][j]=0;   

                 else if(wt[i-1]<=j)
                {
                    q[i][j]=Math.max(val[i-1]+q[i-1][j-wt[i-1]],q[i-1][j]);
                }
                else if(wt[n-1]>W) 
                {
                    q[i][j]=q[i-1][j];
                 }            
             }      
        }
        return q[n][W];
    }

    public static void main(String[] args) {
        
        int val[] = new int[] { 60, 100, 120 }; 
        int wt[] = new int[] { 10, 20, 30 }; 
        int W = 50; 
        System.out.println(maximizeProfitRecursion(val,wt,W,val.length));

        //Top Down DP
        t=new int[val.length+2][W+2];
        for (int i = 0; i < t.length; i++){
            Arrays.fill(t[i], -1);
        }
         System.out.println(maximizeProfitTopDownDP(val,wt,W,val.length));

         //Bottom Up DP
        W = 50; 
        q=new int[val.length+2][W+2];
        for (int i = 0; i < q.length; i++){
            Arrays.fill(t[i], -1);
        }
         System.out.println(maximizeProfitBottomUpDP(val,wt,W,val.length));
    }
}