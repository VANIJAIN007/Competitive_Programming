package Assignment1;


import java.util.Scanner;
public class Maze_Path
{
    static int count=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int arr[][]=new int[n1][n2];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        maze_path(arr,"",0,0,n1-1,n1-1);
        System.out.println(count);
    }
    public static void maze_path(int[][] arr, String ans,int curr_x1,int curr_y1,int dest_x1,int dest_y1)
    {
        if(curr_x1 > dest_x1 || curr_y1 > dest_y1)
        {
            return;
        }
        if(curr_x1 == dest_x1 && curr_y1 == dest_y1)
        {
            count=count+1;
            System.out.println(ans);
        }
        maze_path(arr,ans+"V", curr_x1 +1, curr_y1, dest_x1, dest_y1);
        maze_path(arr,ans+"H", curr_x1, curr_y1 +1, dest_x1, dest_y1);
    }
}
