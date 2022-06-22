package Practice;

import java.util.Stack;

public class DeleteMiddleelementOfStack
{
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        Stack<Integer> st1=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);

       // System.out.println(st);
        //middleElement(st,st1);
        System.out.println(st);
        middleElementDelete(st,st.size(),0);
        System.out.println(st);
    }
    public static void middleElement(Stack<Integer> st,Stack<Integer> st1)
    {
        int s=st.size()/2;
        for (int i = 0; i < s; i++) {
            int temp=st.pop();
            st1.push(temp);
            System.out.println(temp);
        }
        st.pop();
        while(!st1.isEmpty())
        {
            int a =st1.pop();
            st.push(a);
        }
    }
    public static void middleElementDelete(Stack<Integer> st,int n,int curr)
    {
        if(st.isEmpty() || curr==n)
        {
            return;
        }
        int item=st.pop();
        middleElementDelete(st,n,curr+1);
        if(curr!=n/2)
        {
            st.push(item);
        }
    }
}
