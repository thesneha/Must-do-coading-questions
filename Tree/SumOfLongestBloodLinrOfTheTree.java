package Tree;

/*
import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;

class Node
{
    int data;
    Node left, right;

    Node(int key)
    {
        data = key;
        left = right = null;
    }
}

class BinaryTree
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0)
        {
            // int n = sc.nextInt();
            HashMap<Integer, Node> m = new HashMap<Integer, Node> ();
            int n = sc.nextInt();
            Node root = null;
            while (n > 0)
            {

                int n1 = sc.nextInt();
                int n2 = sc.nextInt();
                char lr= sc.next().charAt(0);


                Node parent = m.get(n1);
                if (parent == null)
                {
                    parent = new Node(n1);
                    m.put(n1, parent);
                    if (root == null)
                        root = parent;
                }
                Node child = new Node(n2);
                if (lr == 'L')
                    parent.left = child;
                else
                    parent.right = child;
                m.put(n2, child);
                n--;
            }


            GfG gfg = new GfG();
            System.out.println(gfg.sumOfLongRootToLeafPath(root));

        }

    }
}



class GfG
{
    int res=0;
    int maxSum=Integer.MIN_VALUE;
    int maxSize=Integer.MIN_VALUE;
    public  int sumOfLongRootToLeafPath(Node node)
    {

        res=0;
        maxSum=Integer.MIN_VALUE;
        maxSize=Integer.MIN_VALUE;
        int sum=0;

        Stack<Integer> s= new Stack<>();
        hasSum(node,s,sum);
        return  res;


    }


    public  void  hasSum(Node node ,Stack<Integer>s,int sum)
    {
        if (node==null)
        {
            return;
        }
        s.push(node.data);
        sum=sum+node.data;
        if (node.left==null&&node.right==null)
        {
            if (s.size()==maxSize)
            {
                if (sum>maxSum)
                {
                    maxSum=sum;
                    res=maxSum;
                }

            }
            else if(s.size()>maxSize)
            {
                maxSum=sum;
                maxSize=s.size();
                res=maxSum;

            }

        }

        else {
            hasSum(node.left,s,sum);
            hasSum(node.right,s,sum);
        }
        sum=sum-s.peek();
        s.pop();
    }

}
*/