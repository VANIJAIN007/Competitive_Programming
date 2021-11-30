package Assignment1;

import java.util.Scanner;

public class Recursion_Subsequence
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        SubsequenceRecursion(str,"");
    }
    public static void SubsequenceRecursion(String str,String ans)
    {
        if(str.isEmpty())
        {
            System.out.print(ans);
            return;
        }
        char ch=str.charAt(0);
        String part=str.substring(1);
        SubsequenceRecursion(part,ans);
        SubsequenceRecursion(part,ans+ch);
    }
}
