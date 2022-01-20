package Assignment2;

import java.util.Scanner;

public class ClimbingStairs {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(climb(0,n,""));
    }
    public static int climb(int curr,int dest,String ans)
    {
        if(curr>dest)
        {
            return 0;
        }
        if(curr==dest)
        {
            return 1;
        }

        int c1=climb(curr+1,dest,ans+'1');
        int c2=climb(curr+2,dest,ans+'2');

        return c1+c2;

    }
}
