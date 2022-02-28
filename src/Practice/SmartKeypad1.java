package Practice;

import java.util.Scanner;

public class SmartKeypad1
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        stringMapped(str,"");
    }
    public static void stringMapped(String str,String ans)
    {
        if(str.length()==0)
        {
            System.out.println(ans);
            return;
        }
        char ch=str.charAt(0);
        String mapped=digits(ch);
        for(int i=0;i<mapped.length();i++)
        {
            String part=str.substring(1);
            stringMapped(part,ans+mapped.charAt(i));
        }
    }
    public static String digits(char ch)
    {

            if(ch=='0')
                 return " ";
            else if(ch=='1')
                return ".+@$";
            else if(ch=='2')
                return "abc";
            else if(ch=='3')
                return "def";
            else if(ch=='4')
                return "ghi";
            else if(ch=='5')
                return "jkl";
            else if(ch=='6')
                return "mno";
            else if(ch=='7')
                return "pqrs";
            else if(ch=='8')
                return "tuv";
            else if(ch=='9')
                return "wxyz";
            return "";
        }
    }

