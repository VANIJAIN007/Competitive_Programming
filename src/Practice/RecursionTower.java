package Practice;

import java.util.Scanner;

public class RecursionTower
{
    static int count=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        moveDisc(n,"T1","T3","T2");
    }
    public static void moveDisc(int n,String a,String b,String c)
    {
        if(n==1)
        {
            System.out.println("Move"+n+"th disc from"+a+"to"+c);
            return;
        }
        moveDisc(n-1,a,c,b);
        System.out.println("Move"+n+"th disc from"+a+"to"+c);
        count++;
        moveDisc(n-1,b,a,c);

    }

}
