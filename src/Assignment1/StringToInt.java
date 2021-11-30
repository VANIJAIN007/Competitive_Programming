package Assignment1;

import java.util.Scanner;

public class StringToInt
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        StringInt(str);
    }
    public static void StringInt(String str)
    {
        int num=0;
        int n=str.length();

        for(int i=0;i<n;i++)
        {
            num=num*10+((int)str.charAt(i)-48);
        }
        System.out.println(num);

    }
}
