package Tree;

/*
import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Main {
    static Node buildTree(String str) {

        if (str.length() == 0 || str.charAt(0) == 'N') {
            return null;
        }

        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue

        Queue<Node> queue = new LinkedList<>();

        queue.add(root);
        // Starting from the second element

        int i = 1;
        while (queue.size() > 0 && i < ip.length) {

            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();

            // Get the current node's value from the string
            String currVal = ip[i];

            // If the left child is not null
            if (!currVal.equals("N")) {

                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }

            // For the right child
            i++;
            if (i >= ip.length) break;

            currVal = ip[i];

            // If the right child is not null
            if (!currVal.equals("N")) {

                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String s = br.readLine().trim();
            Node root = buildTree(s);
            String[] ab = br.readLine().trim().split(" ");
            int a = Integer.parseInt(ab[0]);
            int b = Integer.parseInt(ab[1]);

            GfG g = new GfG();
            System.out.println(g.findDist(root, a, b));
        }
    }
}



class GfG {
    Stack<Node> s1= new Stack<>();
    Stack<Node> s2= new Stack<>();
    Stack<Node> s3= new Stack<>();
    int s1size;
    int s2size;

    int findDist(Node root, int a, int b) {
        s3.clear();
        s1size=0;
        s2size=0;
       Node lca= lcaForMinDis(root,a,b);
       allAncestors(root,s3,lca.data);
       int x=s1size+s2size-2*s3.size();
       return x;
    }

    public Node lcaForMinDis(Node root,int a,int b)
    {
        s1.clear();
        s2.clear();
        allAncestors(root,s1,a);
        allAncestors(root,s2,b);
        s1size=s1.size();
        s2size=s2.size();
        Node s1Pop;
        Node s2Pop;
        Node res=null;
        if (s1.isEmpty()&&s2.isEmpty())
        {
            return null;
        }
        if ((!s1.isEmpty())&&(!s2.isEmpty()))
        {
            int x=Math.min(s1.size(),s2.size());
            for (int i=0;i<x;i++)
            {
                s1Pop=s1.peek();
                s2Pop=s2.pop();
                if (!s1Pop.equals(s2Pop))
                {
                    break;
                }
                res=s1.pop();
            }
            return res;
        }
        return s1.isEmpty()?s2.get(0):s1.get(0);
    }

    public boolean allAncestors(Node root,Stack<Node>s ,int n)
    {
        if (root==null)
        {
            return false;
        }
        if (root.data==n)
        {
            s.push(root);
            return true;
        }
        if (allAncestors(root.left,s,n)||allAncestors(root.right,s,n))
        {
            s.push(root);
            return true;
        }
        return false;
    }
}
*/