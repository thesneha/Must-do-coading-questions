package Tree;

/*
import java.io.*;
import java.util.*;

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
            Node currNode = q.remove();

            // Get the current node's value from the string
            String currVal = s[i];

            // If the left child is not null
            if(!currVal.equals("N"))
            {

                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                q.add(currNode.left);
            }

            // For the right child
            i++;
            if(i >= s.length)
                break;
            currVal = s[i];

            // If the right child is not null
            if(!currVal.equals("N"))
            {

                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                q.add(currNode.right);
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

            Solution T = new Solution();

            T.printBoundary(root);
            System.out.println();
            t--;
        }
    }
}


class Solution
{
    void printBoundary(Node node)
    {
       if (node==null)
       {
           return;
       }
       System.out.print(node.data+" ");
        printLeft(node.left);
        printLeftLeaf(node.left);
        printRightLeaf(node.right);
        printRight(node.right);

    }

    public  void printLeft(Node node)
    {
        if (node==null)
        {
            return;
        }
        if (node.left!=null)
        {
            System.out.print(node.data+" ");
            printLeft(node.left);
        }
        else if (node.right!=null)
        {
            System.out.print(node.data+" ");
            printLeft(node.right);
        }

    }
    public  void printRight(Node node) {
        if (node == null) {
            return;
        }
        if (node.right != null) {
            printRight(node.right);
            System.out.print(node.data+" ");
        } else if (node.left != null) {
            printRight(node.left);
            System.out.print(node.data+" ");
        }

    }

    public  void printLeftLeaf(Node node)
    {
        if (node==null)
        {
            return;
        }
        printLeftLeaf(node.left);
        printLeftLeaf(node.right);
        if (node.left==null&&node.right==null)
        {
            System.out.print(node.data+" ");
        }

    }


    public  void printRightLeaf(Node node)
    {
        if (node==null)
        {
            return;
        }
        printRightLeaf(node.left);
        printRightLeaf(node.right);
        if (node.left==null&&node.right==null)
        {
            System.out.print(node.data+" ");
        }
    }

}
*/