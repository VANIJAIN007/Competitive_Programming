package Assignment1;

import java.util.Scanner;

public class NthTriangle
{
    static int sum=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Triangle(n);

    }
    public static void Triangle(int n){
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
