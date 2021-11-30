package Assignment1;

import java.util.Scanner;

public class Last_Index
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
        System.out.println(lastindex(arr,m));
    }
    public static int lastindex(int arr[],int m)
    {
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]==m)
            {
                return i;
            }
        }
        return 0;
    }
}
