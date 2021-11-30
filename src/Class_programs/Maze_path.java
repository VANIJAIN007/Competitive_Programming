package Class_programs;

import java.util.Scanner;

public class Maze_path
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=3;
        int col=4;
        mazepath(0,0,3,3,"");
    }
    public static void mazepath(int curr_x,int curr_y,int dest_x,int dest_y,String ans)
    {
        if(curr_x==dest_x-1 && curr_y==dest_y-1)
        {
            System.out.println(ans);
            return;
        }
        if(curr_x>=dest_x || curr_y>=dest_y)
        {
            return;
        }

        mazepath(curr_x,curr_y+1,dest_x,dest_y,ans+"H");//Hor
        mazepath(curr_x+1,curr_y,dest_x,dest_y,ans+"V");//Ver



    }
}
