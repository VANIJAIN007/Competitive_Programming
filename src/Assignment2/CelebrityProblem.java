package Assignment2;

import java.util.*;
/*
public class CelebrityProblem {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int cel = Celebrity(n,arr);
        if(cel !=-1){
            System.out.println(cel);
        }
        else{
            System.out.println("No Celebrity");
        }
    }
    static boolean notCeleb(int A, int B, int[][] arr)
    {
        boolean ans = (arr[A][B] == 1) ?
                true :
                false;
        return ans;
    }

    static int Celebrity(int n, int[][] arr)
    {
        Stack<Integer> st = new Stack<>();
        int c;

        for (int i = 0; i < n; i++)
        {
            st.push(i);
        }

        while (st.size() > 1)
        {
            int A = st.pop();
            int B = st.pop();

            if (notCeleb(A, B,arr))
            {
                st.push(B);
            }

            else
                st.push(A);
        }

        if(st.isEmpty())
            return -1;

        c = st.pop();

        for (int i = 0; i < n; i++)
        {
            if (i != c && (notCeleb(c, i,arr) ||
                    !notCeleb(i, c,arr)))
                return -1;
        }
        return c;
    }

}
*/

public class CelebrityProblem
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<arr.length;i++)
        {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        celebProb(arr);
    }
    public static void celebProb(int[][] arr)
    {
        Stack<Integer> poten=new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            poten.push(i);
        }
        System.out.println(poten);

        while(poten.size()>1) {
            int A=poten.pop();
            int B=poten.pop();
            if (arr[A][B] == 1) {
                poten.push(B);
            } else {
                poten.push(A);
            }
        }
        int cel=poten.pop();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[cel][i]==1)
            {
                System.out.println("not celebrity");
            }
            for(int j=0;j<arr.length;j++)
            {
                if(arr[j][cel]==0 && j!=cel)
                {
                    System.out.println("not celebrity");
                }

            }


        }
        System.out.println(cel);



    }
}
