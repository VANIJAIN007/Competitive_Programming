package Assignment2;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParenthesis
{
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String str=sc.next();
            //balanceString(str,0,0,0);
        balanWithStackCheck(str);

    }
    /*public static void balanceString(String str,int curr,int count,int count1)
    {
        if(count==count1 && curr==str.length())
        {
            System.out.println("Yes");
            return;
        }
        if(count>count1 && curr==str.length()|| count<count1 && curr==str.length())
        {
            System.out.println("No");
            return;
        }
        if(str.charAt(0)==')' || str.charAt(0)=='}'  || str.charAt(0)==']'|| str.charAt(str.length()-1)=='(' || str.charAt(str.length()-1)=='{' || str.charAt(str.length()-1)=='[')
        {
            System.out.println("No");
            return;
        }
        char ch=str.charAt(curr);
        if(ch=='(' || ch=='{'  || ch=='[')
        {
            balanceString(str,curr+1,count+1,count1);
        }
        else
        {
            balanceString(str,curr+1,count,count1+1);
        }

    }*/

    public static void balanWithStackCheck(String str)
    {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            st.push(str.charAt(i));
        }
        char ch=st.pop();
        if(ch==')')
        {
            char a=st.peek();
            if(a==ch)
            {
                char item=st.pop();
            }
            else
            {
            }
        }
    }
}
