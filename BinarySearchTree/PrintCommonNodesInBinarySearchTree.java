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
            Node root1 = buildTree(s);

            s = br.readLine();
            Node root2 = buildTree(s);

            BST g=new BST();
            ArrayList<Integer> res = new ArrayList<Integer>();
            res = g.printCommon(root1,root2);
            for(int i = 0;i<res.size();i++)
                System.out.print(res.get(i) + " ");
            System.out.println();

            t--;
        }
    }
}


class BST
{
    public static ArrayList<Integer> printCommon(Node root1,Node root2)
    {
        Queue<Node> q1= new LinkedList<>();
        TreeSet<Integer> ts= new TreeSet<>();
        fillTS( root2,ts);
        TreeMap<Integer ,Integer> hm= new TreeMap<>();
        ArrayList<Integer> al= new ArrayList<>();
        q1.add(root1);

        hm.put(root1.data,1);
        while (!q1.isEmpty())
        {
            Node temp=q1.poll();
            hm.put(temp.data,1);
            if (temp.left!=null)
            {
                q1.add(temp.left);
            }
            if (temp.right!=null)
            {
                q1.add(temp.right);
            }
        }
        for (int s:ts)
        {
            if (hm.containsKey(s))
            {
                al.add(s);
            }

        }

        return al;
    }
    public  static  void fillTS(Node root2,TreeSet<Integer> ts)
    {
        if (root2==null)
        {
            return;
        }
        ts.add(root2.data);
        fillTS(root2.left,ts);
        fillTS(root2.right,ts);
    }

}
*/