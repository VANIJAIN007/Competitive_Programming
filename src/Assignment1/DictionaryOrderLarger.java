package Assignment1;

import java.util.Scanner;

public class DictionaryOrderLarger {
    public static String sort(String str){
        String result ="";
        while (str.length()!=0){
            char ch =str.charAt(0);
            int minChar =0;
            for (int i=0;i<str.length();i++){
                char c=str.charAt(i);
                if(c< ch){
                    ch =c;
                    minChar =i;
                }
            }
            result = result + ch;
            String newStr=str.substring(0, minChar)+str.substring(minChar +1);
            str=newStr;
        }
        return result;
    }
    public static void permutations(String str,String result,String match){
        if(str.length()==0){
            if(result.compareTo(match)>0){
                System.out.println(result);
            }
            return;
        }
        for(int i=0;i<str.length();i++){
            String newString=str.substring(0,i)+str.substring(i+1,str.length());
            permutations(newString,result+str.charAt(i),match);
        }
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String match=str;
        str=sort(str);
        permutations(str,"",match);
    }
}
