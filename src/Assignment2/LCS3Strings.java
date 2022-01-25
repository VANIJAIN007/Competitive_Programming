package Assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class LCS3Strings
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        String c=sc.next();

        int[][][] dp=new int[a.length()][b.length()][c.length()];
        for(int[][] arr:dp)
        {
            for(int[] a1:arr)
            {
                Arrays.fill(a1,-1);
            }
        }
        System.out.println(lengthLCS(a,b,c,0,0,0,dp));
    }
    public static int lengthLCS(String a,String b,String c,int i,int j,int k,int[][][] dp)
    {
        if(i==a.length()||j==b.length()||k==c.length())
        {
            return 0;
        }
        int ans2;
        int ans1=0;
        if(dp[i][j][k]!=-1)
        {
            return dp[i][j][k];
        }

        if(a.charAt(i)==b.charAt(j) && b.charAt(j)==c.charAt(k))
        {

                ans1=1+lengthLCS(a,b,c,i+1,j+1,k+1,dp);

                return ans1;

            }

        else {
            int fs1 = lengthLCS(a, b, c, i + 1, j, k,dp);
            int fs2 = lengthLCS(a, b, c, i, j + 1, k,dp);
            int fs3 = lengthLCS(a, b, c, i, j, k + 1,dp);

             ans2 = Math.max(fs1, fs2);

             return dp[i][j][k]=ans1+Math.max(ans2,fs3);


        }

    }
}
