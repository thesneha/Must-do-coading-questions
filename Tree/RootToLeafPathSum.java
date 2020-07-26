package Tree;
/*
import java.util.*;
import java.io.*;

class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
} class GfG {
    public static Node buildTree(String str) {

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
            String s = br.readLine();
            Node root = buildTree(s);
            int sum = Integer.parseInt(br.readLine().trim());
            Tree tr = new Tree();
            if (tr.hasPathSum(root, sum)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}

class Tree {
    static  boolean res=false;
    boolean hasPathSum(Node node, int sum) {
        res=false;
        int sumof=0;
        Stack<Integer> s= new Stack<>();
        hasSum(node,sum,s,sumof);
        return  res;
    }

    public  void  hasSum(Node node ,int sum,Stack<Integer>s,int sumof)
    {
        if (node==null)
        {
            return;
        }
        s.push(node.data);
        sumof=sumof+node.data;
        if (node.left==null&&node.right==null)
        {
            if (sumof==sum)
            {
                res=true;
            }
        }
        else {
            hasSum(node.left,sum,s,sumof);
            hasSum(node.right,sum,s,sumof);
        }
        sumof=sumof-s.peek();
        s.pop();
    }
}
*/