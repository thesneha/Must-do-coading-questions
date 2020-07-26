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

        while(t-- > 0){
            String s = br.readLine();
            Node root = buildTree(s);
            BinaryTree obj = new BinaryTree();
            obj.verticalOrder(root);
            System.out.println();

        }
    }
}


class BinaryTree
{
    static void verticalOrder(Node root)
    {
        if (root==null)
        {
            return;
        }
        int hd=0;
        Map<Integer,ArrayList<Integer>> hm=new TreeMap<>();
        getHd(root,hd,hm);
        for (Map.Entry<Integer,ArrayList<Integer>> x:hm.entrySet())
        {
            ArrayList<Integer> al=x.getValue();

            Iterator<Integer>i=al.iterator();
            while (i.hasNext())
            {
                System.out.print(i.next()+" ");
            }

        }

    }

    public static void  getHd(Node root,int hd,Map<Integer,ArrayList<Integer>> hm)
    {
        if (root==null)
        {
            return;
        }
        if (hm.get(hd)==null)
        {
            ArrayList<Integer> al= new ArrayList<>();
            al.add(root.data);
            hm.put(hd,al);

        }
        else {
            ArrayList<Integer> al= hm.get(hd);
            al.add(root.data);
            hm.put(hd,al);

        }
        getHd(root.left,hd-1,hm);
        getHd(root.right,hd+1,hm);

    }
}*/