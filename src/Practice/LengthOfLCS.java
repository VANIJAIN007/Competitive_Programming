package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class LengthOfLCS
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        int[][] dp=new int[str1.length()][str2.length()];
        for (int[] dc:dp) {
            Arrays.fill(dc,-1);
        }
        System.out.println(lengthLCS(str1,str2,0,0,dp));
    }
    public static int lengthLCS(String str1,String str2,int i,int j,int[][] dp)
    {
        if(i==str1.length() || j==str2.length())
        {
            return 0;
        }
        int  ans=0;
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        if(str1.charAt(i)==str2.charAt(j))
        {
              ans=1+lengthLCS(str1,str2,i+1,j+1,dp);
              return ans;
        }
        else
        {
            int fs1=lengthLCS(str1,str2,i+1,j,dp);
            int fs2=lengthLCS(str1,str2,i,j+1,dp);

            return dp[i][j]=ans+Math.max(fs1,fs2);
        }
    }

}
