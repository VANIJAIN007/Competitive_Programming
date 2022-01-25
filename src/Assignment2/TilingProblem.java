package Assignment2;

import java.util.Scanner;

public class TilingProblem
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(tilePlace(n));
    }
    public static long tilePlace(int n)
    {
        long dp[]=new long[n+1];
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<=n;i++)
        {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
