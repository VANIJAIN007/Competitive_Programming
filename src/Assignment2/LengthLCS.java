package Assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class LengthLCS
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b= sc.next();
        int[][] dp=new int[a.length()][b.length()];
        for (int[] dc:dp) {
            Arrays.fill(dc,-1);
        }
        System.out.println(length(a,b,0,0,dp));
    }
    public static int length(String a,String b,int i,int j,int[][] dp)
    {
        if(i==a.length()||j==b.length())
        {
            return 0;
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        int ans = 0;
        if(a.charAt(i)==b.charAt(j))
        {
            ans=1+length(a,b,i+1,j+1,dp);
            return ans;
        }

        else
        {
            int fs1=length(a,b,i+1,j,dp);
            int fs2=length(a,b,i,j+1,dp);
            
            return dp[i][j]=ans+Math.max(fs1,fs2);

            
        }



    }
}
