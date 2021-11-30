package Assignment1;

import java.util.Scanner;

public class SubsequenceAscii
{
    static int count=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        Subsequence_Ascii(str,"");
        System.out.println();
        System.out.print(count);
    }
    public static void Subsequence_Ascii(String str,String ans)
    {
        if(str.isEmpty())
        {
            count++;
            System.out.print(ans+" ");
            return;
        }
        char ch=str.charAt(0);
        String part=str.substring(1);
        Subsequence_Ascii(part,ans);
        Subsequence_Ascii(part,ans+ch);
        Subsequence_Ascii(part,ans+(int)ch);

    }
}
