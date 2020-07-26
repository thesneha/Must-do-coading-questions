package Tree;

/*
import java.util.Scanner;
import java.lang.Math;
import java.io.*;
class Node{
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}
class GFG2
{
    public static void inorder(Node root)
    {
        if(root==null)
            return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int []pre=new int[n];
            char []preLN=new char[n];
            for(int i=0;i<n;i++)
            {
                int b=sc.nextInt();
                pre[i]=b;
            }
            for(int i=0;i<n;i++)
            {
                char c=sc.next().charAt(0);
                preLN[i]=c;
            }
            GFG obj=new GFG();
            Node root=obj.constructTree(n,pre,preLN);
            inorder(root);
            System.out.println();
        }
    }
}
class GFG
{
    static int preIndex=0;
    Node constructTree(int n, int pre[], char preLN[])
    {
        Node res=construct(n,pre,preLN);
        preIndex=0;
        return res;
    }

    public  Node construct(int n, int pre[], char preLN[])
    {
        if (preIndex==n)
        {
            return null;

        }

        int x=preIndex;
        Node temp= new Node(pre[preIndex]);
        preIndex++;

        if (preLN[x]!='L')
        {
            temp.left=construct(n,pre,preLN);
            temp.right=construct(n,pre,preLN);

        }
        return temp;
    }
}
*/