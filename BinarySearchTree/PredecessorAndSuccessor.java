package BinarySearchTree;
/*
import java.util.*;

class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}

class Res
{
    Node pre = null;
    Node succ = null;
}
class PreSucc
{

    public static void insert(Node root,int a,int a1,char lr){
        if(root==null){
            return;
        }
        if(root.data==a){
            switch(lr){
                case 'L':root.left=new Node(a1);
                    break;
                case 'R':root.right=new Node(a1);
                    break;
            }
            return;
        }
        insert(root.left,a,a1,lr);
        insert(root.right,a,a1,lr);
    }

    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            if(n==0)
            {
                System.out.println(0);
                continue;
            }
            Node root = null;
            Res p = new Res();
            Res s = new Res();
            for(int i=0;i<n;i++){

                int a=sc.nextInt();
                int a1=sc.nextInt();

                char lr=sc.next().charAt(0);

                if(i==0){

                    root=new Node(a);

                    switch(lr)
                    {

                        case 'L':root.left=new Node(a1);
                            break;
                        case 'R':root.right=new Node(a1);
                            break;
                    }
                }
                else{
                    insert(root,a,a1,lr);
                }
            }

            int key = sc.nextInt();
            GfG g=new GfG();
            g.findPreSuc(root, p, s, key);

            if(p.pre != null)
                System.out.print(p.pre.data + " ");
            else
                System.out.print("-1" + " ");

            if(s.succ != null)
                System.out.println(s.succ.data);
            else
                System.out.println("-1");


        }
    }
}

class GfG
{
    public static void findPreSuc(Node root, Res p, Res s, int key)
    {
        Node current =ispresent(root,key);
        if (current!=null)
        {
            successor(root,current,s,key);
            predecessor(root,current,p,key);
        }
        else {
            withoutKeyFindpresuc(root,p,s,key);
        }
    }
    public static void withoutKeyFindpresuc(Node root,Res p,Res s,int key)
    {
        if (root == null) {
            return;
        }
        if (root.data> key)
        {
            s.succ = root ;
            withoutKeyFindpresuc(root.left, p, s, key);
        }
        else
        {
            p.pre = root ;
            withoutKeyFindpresuc(root.right, p, s, key);
        }

    }



    public  static  void predecessor(Node root,Node current,Res p,int key)
    {
        if (current.left!=null)
        {
            Node temp= current.left;
            Node par=null;
            while (temp!=null)
            {
                par=temp;
                temp=temp.right;
            }
            p.pre=  par;
        }
        else {
            Node precedence=null;
            Node ancestor=root;
            while (ancestor!=current)
            {
                if (current.data>ancestor.data)
                {
                    precedence=ancestor;
                    ancestor=ancestor.right;
                }
                else {
                    ancestor=ancestor.left;
                }
            }
            p.pre=precedence;
        }
    }

    public static void successor(Node root,Node current,Res s,int key)
    {
        if (current.right!=null)
        {
            Node temp= current.right;
            Node suc=null;
            while (temp!=null)
            {
                suc=temp;
                temp=temp.left;
            }
            s.succ=  suc;
        }
        else {
            Node successor=null;
            Node ancestor=root;
            while (ancestor!=current)
            {
                if (current.data<ancestor.data)
                {
                    successor=ancestor;
                    ancestor=ancestor.left;
                }
                else {
                    ancestor=ancestor.right;
                }
            }
            s.succ=successor;
        }
    }

    public static Node ispresent(Node root,int key)
    {
        if (root==null)
        {
            return null;
        }
        while (root!=null)
        {
            if (root.data==key)
            {
                return root;
            }
            if (root.data<key)
            {
                root=root.right;
            }
            else if (root.data>key)
            {
                root=root.left;
            }

        }
        return null;
    }
}
*/