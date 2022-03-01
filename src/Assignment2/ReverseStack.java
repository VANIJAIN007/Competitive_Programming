package Assignment2;

import java.util.Scanner;
import java.util.Stack;
public class ReverseStack
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]= sc.nextInt();
        }
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            st.push(arr[i]);
        }
        System.out.println(st);
        reverseStack(st);
        System.out.println(st);


    }
    public static void reverseStack(Stack<Integer> st)
    {
        if(st.isEmpty())
        {
            return;
        }
            int item=st.pop();
            reverseStack(st);
            insideBottom(st,item);


    }
    public static void insideBottom(Stack<Integer> st,int item)
    {
        if(st.isEmpty() || st.peek()<item)
        {
            System.out.println("item is"+item);
            st.push(item);

        }
        else {
            int a = st.peek();
            st.pop();
            insideBottom(st, item);
            st.push(a);
        }
    }


















    /*public static void reverseStack(int[] arr,int n,Stack st,int index)
    {
        if(index== arr.length)
        {
            return;
        }
        if(index<0)
        {
            return;
        }

        st.pop();
        reverseStack(arr,n-1,st,index+1);
        while(st.isEmpty())
        {
            st.push(arr[index]);
            reverseStack(arr,n+1,st,index-1);
        }
    }*/
}
