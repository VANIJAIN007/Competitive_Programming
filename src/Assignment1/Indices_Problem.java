package Assignment1;

import java.util.Scanner;

public class Indices_Problem
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        element_search(arr,m);
    }
    public static void element_search(int[] arr,int m)
    {

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==m)
            {
                System.out.print(i+" ");
            }
        }
    }
}
