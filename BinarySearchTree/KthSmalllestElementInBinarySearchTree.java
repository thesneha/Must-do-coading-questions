package BinarySearchTree;

/*

import java.io.*;
import java.util.*;
import java.math.*;

class Node
{
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}

class GFG
{
    static Node buildTree(String str)
    {
        // Corner Case
        if(str.length() == 0 || str.equals('N'))
            return null;
        String[] s = str.split(" ");

        Node root = new Node(Integer.parseInt(s[0]));
        Queue <Node> q = new LinkedList<Node>();
        q.add(root);

        // Starting from the second element
        int i = 1;
        while(!q.isEmpty() && i < s.length)
        {
            // Get and remove the front of the queue
            Node currrNode = q.remove();

            // Get the currrent node's value from the string
            String currrVal = s[i];

            // If the left child is not null
            if(!currrVal.equals("N"))
            {

                // Create the left child for the currrent node
                currrNode.left = new Node(Integer.parseInt(currrVal));

                // Push it to the queue
                q.add(currrNode.left);
            }

            // For the right child
            i++;
            if(i >= s.length)
                break;
            currrVal = s[i];

            // If the right child is not null
            if(!currrVal.equals("N"))
            {

                // Create the right child for the currrent node
                currrNode.right = new Node(Integer.parseInt(currrVal));

                // Push it to the queue
                q.add(currrNode.right);
            }

            i++;
        }

        return root;
    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t>0)
        {
            String s = br.readLine();
            Node root = buildTree(s);

            int k = Integer.parseInt(br.readLine().trim());

            Solution T = new Solution();
            System.out.println(T.KthSmallestElement(root,k));
            t--;
        }
    }
}

class Solution
{
    static int pre=Integer.MIN_VALUE;
    static  int count=1;
    static  int res=-1;
    public int KthSmallestElement(Node root, int K)
    {
         pre=Integer.MIN_VALUE;
         count=1;
         res=-1;
         max(root,K);
         return  res;
    }

    public boolean max(Node root, int K)
    {
        if (root==null)
        {
            return true;
        }
        else {
            if (!max(root.left,K))
            {
                return false;
            }
            if (count==K)
            {
                res=root.data;
                return  false;
            }

            pre=root.data;
            count=count+1;
            return max(root.right,K);
        }
    }
}


*/