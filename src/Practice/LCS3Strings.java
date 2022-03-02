package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class LCS3Strings
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        String str3=sc.next();
        int i=0;int j=0;int k=0;
        int[][][] dp=new int[str1.length()][str2.length()][str3.length()];
        for (int[][] a:dp) {
            for(int[] b:a)
            {
                Arrays.fill(b,-1);
            }

        }

        System.out.println(LCS3(str1,str2,str3,i,j,k,dp));
    }
    public static int LCS3(String str1,String str2,String str3,int i,int j,int k,int[][][] dp)
    {
        if(i==str1.length() || j==str2.length() || k==str3.length())
        {
            return 0;
        }
        int ans1;
        int ans=0;
        if(dp[i][j][k]!=-1)
        {
            return dp[i][j][k];
        }

        if(str1.charAt(i)==str2.charAt(j) && str2.charAt(j)==str3.charAt(k))
        {
            ans=1+LCS3(str1,str2,str3,i+1,j+1,k+1,dp);
            return ans;
        }
        else
        {
            int fs1=LCS3(str1,str2,str3,i,j,k+1,dp);
            int fs2=LCS3(str1,str2,str3,i,j+1,k,dp);
            int fs3=LCS3(str1,str2,str3,i+1,j,k,dp);
            ans1=Math.max(fs1,fs2);

            return dp[i][j][k]=ans+Math.max(ans1,fs3);
        }

    }
}
