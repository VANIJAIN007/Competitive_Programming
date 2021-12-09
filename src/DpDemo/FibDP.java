package DpDemo;

import java.util.Scanner;

public class FibDP
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] dp=new int[n+1];
    }
    public static int fibdp(int n,int[] dp)
    {

        if(n==1||n==0)
        {
            return n;
        }
        if(dp[n]!=0)
        {
            return dp[n];
        }
        int f1=fibdp(n-1,dp);
        int f2=fibdp(n-2,dp);
        return f1+f2;

    }
}
