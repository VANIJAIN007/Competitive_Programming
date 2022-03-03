package Practice;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStackWithAnotherStack
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        Stack<Integer> helperst=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println(st);
        reverseStack(st,helperst);
        System.out.println(st);
    }
    public static void reverseStack(Stack<Integer> st,Stack<Integer> helperst)
    {
        int a ;
        while(!st.isEmpty())
        {
            int item=st.pop();
            helperst.push(item);
            if(!helperst.isEmpty())
            {
                 a =helperst.pop();
                reverseStack(st,helperst);
            }

        }

        
    }
}
