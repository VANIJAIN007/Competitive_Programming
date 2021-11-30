package Assignment1;

import java.util.Scanner;

public class Move_All_X_End
{
    public static int count=0;
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        allXAtEnd(str,"");
    }
    public static void allXAtEnd(String question, String answer){
        if(question.length()==0){
            for(int i=0;i<count;i++){
                answer = answer +"x";
            }
            System.out.print(answer);
            return;
        }
        char ch = question.charAt(0);
        String restStr="";
        if(question.length()!=1){
            restStr= question.substring(1);
        }
        if(ch =='x'){
            count++;
            allXAtEnd(restStr, answer +"");
        }
        else{
            allXAtEnd(restStr, answer + ch);
        }

    }
}
