package Assignment1;

import java.util.Scanner;

public class NQueen {
    public static int count;
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int num =sc.nextInt();
        int board[][]=new int[num][num];
        nQueen(board, num,0);
        System.out.print(count);
    }
    public static boolean validMoves(int Board[][], int current, int currc, int num){
        boolean flag=true;
        int i= current;
        int j;
        while(i>=0){
            if(Board[i][currc]==1){
                flag=false;
                break;
            }
            i--;
        }
        i= current;
        j= currc;
        while (i>=0 && j>=0){
            if(Board[i][j]==1){
                flag=false;
                break;
            }
            i--;
            j--;
        }
        i= current;
        j= currc;
        while (i>=0 && j< num){
            if(Board[i][j]==1){
                flag=false;
                break;
            }
            i--;
            j++;
        }
        return flag;
    }
    public static void nQueen(int ar[][], int n, int cr){

        if(cr==n){
            count++;
            return;
        }

        for(int cc=0;cc<n;cc++){
            if(validMoves(ar,cr,cc,n)){
                ar[cr][cc]=1;
                nQueen(ar,n,cr+1);
                ar[cr][cc]=0;
            }
        }

    }
}
