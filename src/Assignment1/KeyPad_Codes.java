package Assignment1;

import java.util.*;
public class KeyPad_Codes {
    static int count=0;
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        keypad_codes(str,"");
        System.out.println();
        System.out.println(count);
    }
    public static String mapp(char ch)
    {
        switch(ch)
        {
            case '1':
                return "abc";

            case '2':
                return "def";

            case '3':
                return "ghi";

            case '4':
                return "jkl";

            case '5':
                return "mno";

            case '6':
                return "pqrs";

            case '7':
                return "tuv";

            case '8':
                return "wx";

            case '9':
                return "yz";

            default:
                return "";

        }
    }
    public static void keypad_codes(String str,String ans)
    {
        if(str.length()==0)
        {
            System.out.print(ans+" ");
            count++;
            return;
        }
        char ch=str.charAt(0);
        String map_key=mapp(ch);
        for(int i=0;i<map_key.length();i++)
        {
            keypad_codes(str.substring(1),ans+map_key.charAt(i));
        }
    }
}



