package Assignment1;

import java.util.Scanner;

public class RatChase {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int m =sc.nextInt();
        int n = sc.nextInt();
        char arr[][]= new char[m][n];
        for(int i = 0; i< m; i++){
            String s=sc.next();
            for(int j = 0; j< n; j++){
                arr[i][j]=s.charAt(j);
            }
        }
        int br[][]= new int[m][n];
        findpath(arr,br,0,0, m -1, n -1);
        if(count==0)
            System.out.print("NO PATH FOUND");
    }
    static int count =0;
    static void findpath(char arr[][],int arr1[][],int rr,int s1,int rre,int se){
        if(rr == rre && s1 == se){
            arr1[rr][s1]=1;
            for(int k = 0; k< rre +1; k++){
                for(int g = 0; g< se +1; g++)
                    System.out.print(arr1[k][g]+" ");
                System.out.println();
            }
            count++;
            return;
        }
        if(rr > rre || s1 > se || rr <0|| s1 <0|| arr[rr][s1]=='X'|| arr1[rr][s1]==1)
            return;
        arr1[rr][s1]=1;
        findpath(arr, arr1, rr -1, s1, rre, se);
        findpath(arr, arr1, rr +1, s1, rre, se);
        findpath(arr, arr1, rr, s1 -1, rre, se);
        findpath(arr, arr1, rr, s1 +1, rre, se);
        arr1[rr][s1]=0;
    }
}
