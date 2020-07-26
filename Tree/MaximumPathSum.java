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

            GfG g = new GfG();
            System.out.println(g.maxPathSum(root));
        }
    }
}

class GfG {

    public static int maxPathSum(Node root) {
        Result result=new Result();
        finaldiameter(root,result);
        return result.res;
    }
    public  static int finaldiameter(Node root,Result result)
    {
        if (root==null)
        {
            return 0;
        }
        if(root.left==null&&root.right==null)
        {
            return  root.data;
        }

        int lsum=finaldiameter(root.left,result);
        int rsum=finaldiameter(root.right,result);
        if (root.left!=null&&root.right!=null) {
            result.res = Math.max(result.res, root.data + lsum + rsum);
            return Math.max(root.data+lsum, root.data+rsum);
        }
        return root.left!=null?root.data+lsum:root.data+rsum;
    }
}

class Result{
    int res=Integer.MIN_VALUE;
}
*/