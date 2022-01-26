package Assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class CoinChange
{
    static int count=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m=sc.nextInt();
        int arr[]=new int[m];

        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        int[][] dp=new int[n+1][m];
        for(int[] a:dp){
            Arrays.fill(a,-1);
        }
        System.out.println(coinChange(arr,0,n,dp));
    }
    public static int coinChange(int[] arr,int index,int n,int[][] dp)
    {
        if(n==0)
        {

            count=count+1;
            return 1;

        }
        if(index==arr.length)
        {
            return 0;
        }
        if(dp[n][index]!=-1)
        {
            return dp[n][index];
        }
        int inc=0;
        int exc=0;

            if(n>=arr[index]) {
                inc += coinChange(arr, index, n - arr[index],dp);
            }
            exc += coinChange(arr, index + 1, n,dp);



            return dp[n][index]=inc+exc;

    }
}
