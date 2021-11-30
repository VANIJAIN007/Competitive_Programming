package Assignment1;

import java.util.Scanner;

public class ArraySorted
{
    static int count=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(arr_sorted(arr));
    }
    public static boolean arr_sorted(int[] arr)
    {

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length-1;j++)
            {
                if(arr[i]>arr[j])
                {
                    count++;
                }
            }
        }
        if(count>0)
        {
            return false;
        }
        return true;
    }
}
