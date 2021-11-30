package Assignment1;

public class Generate_Parenthesis
{
    public static void main(String[] args) {
        paren_valid(0,0,3,"");
    }
    public static void paren_valid(int num_o,int num_c,int n,String ans)
    {
        if(num_o==n && num_c==n)
        {
            System.out.println(ans);
            return;
        }
        if(num_o>n || num_c>n)
        {
            return;
        }
        if(num_c>num_o)
        {
            return;
        }
        paren_valid(num_o+1,num_c,n,ans+"(");
        paren_valid(num_o,num_c+1,n,ans+")");
    }
}
