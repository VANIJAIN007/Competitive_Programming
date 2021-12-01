package Assignment1;

import java.util.Scanner;

public class Replace_All_Pi
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String arr[]=new String[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.next();

        }
        for (int i = 0; i < n; i++) {
            replacePi(arr[i],"");
        }
    }
    public static void replacePi(String str,String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        int flag=0;
        String part="";
        char ch=str.charAt(0);
        if(str.length()!=1) {
            char s1 = str.charAt(1);
            if (ch == 'p' && s1 == 'i') {
                flag = 1;
                part = str.substring(2);
            } else {
                flag = 0;
                part = str.substring(1);
            }
        }
        else
        {
            part="";
        }
        if(flag==1)
        {
            replacePi(part,ans+"3.14");
        }
        else
        {
            replacePi(part,ans+ch);
        }


    }
}
