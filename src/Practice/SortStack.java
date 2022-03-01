package Practice;

import java.util.Stack;

public class SortStack
{
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(30);
        st.push(-5);
        st.push(18);
        st.push(14);
        st.push(-3);
        int arr[]=new int[st.size()];
        System.out.println(st);
        sortStck1(st);
        System.out.println(st);
    }
    /*public static void sortStack(Stack<Integer> st,int index,int[] arr)
    {
        int i = 0;
        if(!st.isEmpty())
        {
            int a=st.pop();
            if(st.isEmpty())
            {
                arr[index]=a;
                for(i=0;i<arr.length;i++)
                {
                    st.push(arr[i]);
                    System.out.println(st);
                }
            }
            if(i==arr.length)
            {
                return;
            }
            int b=st.peek();

            if(a<b)
            {
                arr[index]=a;
                sortStack(st,index+1,arr);
            }
            else
            {
                st.pop();
                arr[index]=b;
                st.push(a);
                sortStack(st,index+1,arr);

            }
        }
    }*/
    public static void sortStck1(Stack<Integer> st)
    {
        if(!st.isEmpty())
        {
            int item=st.pop();
            sortStck1(st);
            insertInSortedOrder(st,item);
        }
    }
    public static void insertInSortedOrder(Stack<Integer> st,int item)
    {
        if(st.isEmpty() || st.peek()<item)
        {
            st.push(item);
            return;
        }
        else
        {
            int a=st.pop();
            insertInSortedOrder(st,item);
            st.push(a);
        }
    }
}
