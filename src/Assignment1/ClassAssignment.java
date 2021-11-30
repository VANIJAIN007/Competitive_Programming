package Assignment1;

import java.util.Scanner;

public class ClassAssignment

{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int j = 1;
        for (int i = 0; i< t; i++ ){
            int n = sc.nextInt();
            int ans = classAssignmentSolution("",n,false);
            System.out.println("#"+ j +" "+":"+" "+ans);
            j++;
        }
    }
    public static int classAssignmentSolution(String ans, int n , boolean
            isPreviousCallingOfb){
        if (ans.length()==n){
            return 1;
        }
        if (ans.length()>n){
            return 0;
        }
        int c = 0;
        c+= classAssignmentSolution(ans+'a',n,false);
        if (!isPreviousCallingOfb){
            c+= classAssignmentSolution(ans+'b',n,true);
        }
        return c;
    }
}
/*
import java.util.*;
public class KeyPad_Codes {
    public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String digit1="a";
        String digit2="b";
        class_ass(digit1,digit2,"",n,false);
    }
    public static void class_ass(String digit1,String digit2,String ans,int n,boolean boo)
    {
        if(n==0)
        {
            System.out.println(ans);
            return;
        }
        if(boo)
        {
            class_ass(digit1,digit2,ans+digit1,n-1,false);
        }
        else
        {
            class_ass(digit1,digit2,ans+digit1,n-1,false);
            class_ass(digit1,digit2,ans+digit2,n-1,true);


        }

    }
}
 */
