package Tree;

/*
import java.util.*;
import java.lang.*;
import java.io.*;

// A Binary Tree node
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

class Is_Leaves_At_Same_Level
{

    static Node buildTree(String str){

        if(str.length()==0 || str.charAt(0)=='N'){
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
        while(queue.size()>0 && i < ip.length) {

            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();

            // Get the current node's value from the string
            String currVal = ip[i];

            // If the left child is not null
            if(!currVal.equals("N")) {

                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }

            // For the right child
            i++;
            if(i >= ip.length)
                break;

            currVal = ip[i];

            // If the right child is not null
            if(!currVal.equals("N")) {

                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }

    // driver function to test the above functions
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t=Integer.parseInt(br.readLine());

        while(t > 0)
        {
            String s = br.readLine();
            Node root = buildTree(s);

            GfG g = new GfG();
            boolean b = g.check(root);
            if(b == true)
                System.out.println(1);
            else
                System.out.println(0);
            t--;
        }
    }
}




class GfG {
    boolean check(Node root) {
        Queue<Node> q = new LinkedList();
        int level=0;
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        if (root != null) {
            q.add(root);
            while (!q.isEmpty()) {
                int nodes = q.size();
                while (nodes>0)
                {
                    Node temp=q.poll();
                    if (temp.left!=null)
                    {
                        q.add(temp.left);
                    }
                    if (temp.right!=null)
                    {
                        q.add(temp.right);

                    }
                    if (temp.left==null&&temp.right==null)
                    {
                        tm.put(level, temp.data);
                    }
                    nodes--;
                }
                level++;
            }
        }
        if (tm.size()>1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
*/