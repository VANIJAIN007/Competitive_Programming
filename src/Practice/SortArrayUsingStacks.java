package Practice;

import java.util.Scanner;
import java.util.Stack;

public class SortArrayUsingStacks
{
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            st.push(arr[i]);
        }
        System.out.println(st);
        sort(st,arr);
        System.out.println(st);
        for(int i=0;i<arr.length;i++)
        {
            int a=st.pop();
            arr[i]=a;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println(st);

    }
    public static void sort(Stack<Integer> st,int[] arr)
    {
        if(!st.isEmpty())
        {
            int temp=st.pop();
            sort(st,arr);
            sortArrayStacks(arr,st,temp);
        }
    }
    public static void sortArrayStacks(int[] arr,Stack<Integer> st,int item)
    {

        if(st.isEmpty() || st.peek()>item)
        {
            st.push(item);
            //sortArrayStacks(arr,st,item);
            return;
        }
        else
        {
            int a=st.pop();
            sortArrayStacks(arr,st,item);
            st.push(a);
        }


    }
}
