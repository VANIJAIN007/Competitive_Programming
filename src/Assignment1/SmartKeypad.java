package Assignment1;

import java.util.Scanner;

public class SmartKeypad {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        print(str, "");
    }
    public static String code(char digits) {
        if (digits == '0'){
            return " ";
        } else if(digits == '1'){
            return ".+@$";
        } else if(digits == '2') {
            return "abc";
        } else if(digits == '3') {
            return "def";
        } else if(digits == '4') {
            return "ghi";
        } else if(digits == '5') {
            return "jkl";
        } else if(digits == '6') {
            return "mno";
        } else if(digits == '7') {
            return "pqrs";
        } else if (digits == '8'){
            return "tuv";
        } else if (digits == '9'){
            return "wxyz";
        }return "";
    }
    public static void print(String ques, String ans) {
        if(ques.length() == 0) {
            System.out.println(ans);
            return;
        }
        char ch= ques.charAt(0);
        String mappedString = code(ch);

        for(int i = 0; i < mappedString.length(); i++) {
            String res = ques.substring(1);
            print(res, ans + mappedString.charAt(i));
        }
    }
}
