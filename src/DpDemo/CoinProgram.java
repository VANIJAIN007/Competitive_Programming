package DpDemo;

import java.util.Scanner;

public class CoinProgram
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int coins[]={2,5,3,6};
        CoinComb(n,coins,"",false,0);

        int[][] dp=new int[n][];
    }
    public static int CoinComb(int n,int[] coins,String ans,boolean flag,int index)
    {
        if(index== coins.length)
        {
            return 0;
        }
        if(n==0)
        {
            System.out.println(ans);
            return 1;
        }
        int inc=0;
        int exc=0;
        if(n>=coins[index]) {
                inc+=CoinComb(n - coins[index], coins, ans + coins[index],true,index+1);
            }

                    exc+=CoinComb(n , coins, ans ,false,index+1);


        return inc+exc;

    }

}
