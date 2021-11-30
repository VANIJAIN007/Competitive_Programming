package Class_programs;

public class mazePath_4directions
{
    public static void main(String[] args) {
        boolean[][] maze=new boolean[4][5];
        maze_direc(new boolean[4][5],0,0);
    }
    public static void maze_direc(boolean[][] maze,int curr_x,int curr_y)
    {
        if(curr_x==maze.length-1 && curr_y==maze[0].length-1)
        {
            maze[curr_x][curr_x]=true;
            display(maze);
            maze[curr_x][curr_y]=false;
            return;

        }
        if(curr_x<0|| curr_x>=maze.length || curr_y<0 ||curr_y>=maze[0].length||maze[curr_x][curr_y]==true)
        {
            return;
        }
        int[] r={0,1,0,-1};
        int[] c={1,0,-1,0};

        for(int i=0;i<c.length;i++)
        {
            maze_direc(maze,curr_x+r[i],curr_y+c[i]);
        }
    }
    public static void display(boolean[][] maze)
    {
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[0].length; j++) {
                System.out.print(maze[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
