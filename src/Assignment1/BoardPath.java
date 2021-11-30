package Assignment1;

import java.util.Scanner;

public class BoardPath
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int res = boardpath(0, n1, n2,"");
        System.out.println();
        System.out.println(res);
    }
    public static int boardpath(int current, int number, int last, String res){
        if (current == number){
            System.out.print(res +" ");
            return 1;
        }
        if (current > number){
            return 0;
        }
        int c =0;
        for (int dice = 1; dice<= last; dice++ ){
            c+=boardpath(current +dice, number, last, res +dice);
        }
        return c;
    }
}

/*
package Assignment7;

import java.util.Scanner;

public class BoardPath
{
    static int count=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        board(0,n,m,"");
        System.out.println();
        System.out.println(count);
    }
    public static void board(int curr,int n,int m,String ans)
    {
        if(curr>n)
        {
            return;
        }
        if(curr==m) {
            count = count + 1;
            System.out.print(ans + " ");
            return;
        }
        board(curr+1,n,m,ans+"1");
        board(curr+2,n,m,ans+"2");
        board(curr+3,n,m,ans+"3");



    }

}

 */