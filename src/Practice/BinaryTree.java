package Practice;

import java.util.Scanner;

public class BinaryTree
{
    static Scanner sc=new Scanner(System.in);


    public class Node
    {
        Node left;
        Node right;
        private static int data;
        Node(int data)
        {
            this.data=data;
        }
    }
    private Node root;
    public BinaryTree()
    {
        this.root=CreateTree(null);
    }
    private Node CreateTree(Node parent)
    {
        int item=sc.nextInt();
        Node nn=new Node(item);
        boolean hlc=sc.nextBoolean();
        boolean hrc=sc.nextBoolean();
        if(hlc)
        {
            nn.left=CreateTree(nn);
        }
        if(hrc)
        {
            nn.right=CreateTree(nn);
        }
        return nn;

    }

    public static void main(String[] args) {
        BinaryTree bt=new BinaryTree();
        bt.Display();

        bt.findElement();

    }

    public void Display()
    {
        this.Display(this.root);
    }
    private void  Display(Node node)
    {
        String str=""+node.data;
        if(node==null)
        {
            return ;
        }
        if(node.left!=null)
        {
            str=str+"<-";

            str=node.left.data+str;
        }
        else
        {
            str="."+str;
        }
        if(node.right!=null)
        {
            str=str+"->";

            str=str+node.right.data;
        }
        else
        {
            str=str+".";
        }
        System.out.println(str);
        Display(node.left);
        Display(node.right);
    }
    public void findElement()
    {
        int ele=sc.nextInt();

        //this.root=findElement(ele,null);
    }
//    private boolean findElement(int ele,Node node)
//    {
//        if(this.root==null)
//        {
//            return false;
//        }
//        if(this.root.data==ele)
//        {
//            return true;
//        }
//        else
//        {
//            findElement(ele,node.left);
//            findElement(ele,node.right);
//
//        }
//    }


}