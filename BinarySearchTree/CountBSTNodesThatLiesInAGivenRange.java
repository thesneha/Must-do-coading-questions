package BinarySearchTree;



/*
import java.io.*;
import java.util.*;

class Node
{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        this.left = this.right = null;
    }
}

class GFG {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();
        while(testcases-->0)
        {
            Node root=null;
            int sizeOfArray=sc.nextInt();
            int arr[]=new int[sizeOfArray];
            for(int i=0;i<sizeOfArray;i++)
            {
                int x=sc.nextInt();
                arr[i]=x;
            }

            for(int i=0;i<sizeOfArray;i++)
            {
                root=Geeks.newNode(root,arr[i]);
            }
            int l,h;
            l=sc.nextInt();
            h=sc.nextInt();
            System.out.println(Geeks.getCountOfNode(root,l,h));

        }
    }
}


class Geeks
{
    public static Node createNewNode(int value)
    {
        Node temp=new Node(value);

        return temp;
    }
    static public Node newNode(Node root,int data)
    {
        if(root==null)
            root=createNewNode(data);
        else if(data<root.data)
            root.left=newNode(root.left,data);
        else
            root.right=newNode(root.right,data);

        return root;
    }

    static int count=0;
    public static int getCountOfNode(Node root,int l, int h)
    {
        count=0;
        countNode(root,l,h);
        return count;
    }

    public  static  void countNode(Node root,int l,int h)
    {
        if (root==null)
        {
            return;
        }
        if (root.data>=l&&root.data<=h)
        {
            count++;
            countNode(root.left, l, h);
            countNode(root.right,l,h);

        }
       else   if (root.data<=l)
        {
            countNode(root.right,l,h);
        }
        else {
            countNode(root.left, l, h);
        }
    }
}
*/
