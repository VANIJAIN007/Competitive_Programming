package Practice;

import java.util.Stack;
import java.util.Scanner;

public class CelebrityProblem
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for(int j=0;j<arr.length;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        Stack<Integer> st=new Stack<>();
        celebrity(arr,st);
    }
    public static void celebrity(int[][] arr,Stack<Integer> st)
    {
        for(int i=0;i<arr.length;i++)
        {
            st.push(i);
        }

    }
}
