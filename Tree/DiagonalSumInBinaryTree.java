package Tree;

/*

import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
import java.util.*;

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

class GfG {

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
    static void printInorder(Node root)
    {
        if(root == null)
            return;

        printInorder(root.left);
        System.out.print(root.data+" ");

        printInorder(root.right);
    }

    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t=Integer.parseInt(br.readLine());

        while(t > 0)
        {
            String s = br.readLine();
            Node root = buildTree(s);
            Tree g = new Tree();
            g.diagonalSum(root);
            System.out.println();
            t--;

        }
    }

}



class Tree
{
    public void diagonalSum(Node root) {

        TreeMap<Integer, List<Integer>> tmap = new TreeMap<Integer, List<Integer>>();

        Queue q = new LinkedList<>();
        q.add(root);
        q.add(0);

        while (!q.isEmpty()) {
            int n = q.size();
            int x = n / 2;
            while (x > 0) {


                Node node = (Node) q.poll();
                int level = (Integer) q.poll();

                if (tmap.containsKey(level)) {
                    List<Integer> ll = tmap.get(level);
                    ll.add(node.data);
                    tmap.put(level, ll);
                } else {
                    List<Integer> li = new LinkedList<Integer>();
                    li.add(node.data);
                    tmap.put(level, li);
                }

                if (node.left != null) {
                    q.add(node.left);
                    q.add(level+1);
                }
                if (node.right != null) {
                    q.add(node.right);
                    q.add(level );
                }
                x--;
            }
        }

        for (Map.Entry e : tmap.entrySet()) {
            List list = (List) e.getValue();
            Iterator<Integer> i = list.iterator();
            int sum=0;

            while (i.hasNext()) {
               sum =sum+i.next();
            }
            System.out.print(sum+" ");

        }
    }

}
*/