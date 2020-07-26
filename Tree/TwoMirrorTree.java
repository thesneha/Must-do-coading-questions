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

class GfG {

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

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String s = br.readLine();
            String s1 = br.readLine();
            Node root = buildTree(s);
            Node root1 = buildTree(s1);
            Tree g = new Tree();
            if (g.areMirror(root, root1)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
class Tree {
    Boolean res=true;
    boolean areMirror(Node a, Node b) {
        if (a.data!=b.data)
        {
            res=false;
        }

        isMirror(a,b);
        return  res;
    }

    public  void  isMirror(Node a,Node b)
    {
        if (a!=null&&b!=null)
        {
            if (equal(a,b)==0)
            {
                res=false;
            }
            isMirror(a.left,b.right);
            isMirror(a.right,b.left);
        }
    }
    public int equal(Node a,Node b) {
        if (a.left != null && b.right != null  ) {
            if (a.left.data == b.right.data ) {
                return 1;

            }
        }
        if (a.right!=null&&b.left!=null)
        {
            if (a.right.data==b.left.data)
            {
                return 1;
            }
        }

        if (a.left==null&&b.right==null||a.right==null&&b.left==null)
        {
            return  1;
        }
        return 0;
    }


}*/