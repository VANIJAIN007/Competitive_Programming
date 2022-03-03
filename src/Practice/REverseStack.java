package Practice;

import java.util.Stack;

public class REverseStack
{
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println(st);
        reverse(st);
        System.out.println(st);

    }
    public static void reverse(Stack<Integer> st)
    {
        if(st.isEmpty())
        {
            return;
        }
        int item=st.pop();
        reverse(st);
        insertAtBottom(st,item);
    }

    public static void insertAtBottom(Stack<Integer> st,int item)
    {
        if(st.isEmpty())
        {
            st.push(item);
        }
        else
        {
            int a =st.peek();
            st.pop();
            insertAtBottom(st,item);

            st.push(a);
        }


    }

}
