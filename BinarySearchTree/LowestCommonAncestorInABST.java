package BinarySearchTree;
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

    public static void main (String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t=Integer.parseInt(br.readLine());
        //Scanner sc = new Scanner(System.in);
        while(t > 0){
            String s = br.readLine();
            Node root = buildTree(s);
            BST g = new BST();
            String X = br.readLine();
            String arr[] = X.split(" ");
            int x , y;
            x = Integer.parseInt(arr[0]);
            y = Integer.parseInt(arr[1]);
            System.out.println(g.LCA(root,x,y).data);
            t--;

        }
    }

}

class BST
{

    Node LCA(Node root, int n1, int n2)
    {
       /* ArrayList<Node> al1= new ArrayList<>();
        ArrayList<Node> al2= new ArrayList<>();
        findal(root,n1,al1);
        findal(root,n2,al2);
        Node res=null;
        for (int i=0;i<Integer.min(al1.size(),al2.size());i++)
        {
            if (al1.get(i)==al2.get(i))
            {
                res=al1.get(i);
            }
        }
        return res;
    }

    public void findal(Node root,int n,ArrayList<Node> al)
    {
        if (root==null)
        {
            return ;
        }
        while (root.data!=n)
        {
            if (root.data<n)
            {
                al.add(root);
                root=root.right;
            }
            else if (root.data>n)
            {
                al.add(root);
                root=root.left;
            }
        }
        al.add(root);*/

    /*  if(root==null)
       {
           return  null;
       }
       if (root.data==n1||root.data==n2)
       {
           return  root;
       }
       if (Math.max(n1,n2)<root.data)
       {
           return LCA(root.left,n1,n2);
       }
       else if (Math.min(n1,n2)>root.data){
           return LCA(root.right,n1,n2);
       }
       else {
           return root;
       }
    }
}*/