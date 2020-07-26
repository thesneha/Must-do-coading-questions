package Tree;
/*
import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int value) {
        data = value;
        left = null;
        right = null;
    }
}

class InorderPostorderToTree {
    public void preOrder(Node root) {
        if (root == null) return;

        System.out.print(root.data + " ");
        preOrder(root.left);

        preOrder(root.right);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        InorderPostorderToTree ip = new InorderPostorderToTree();
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int inorder[] = new int[n];
            int postorder[] = new int[n];
            for (int i = 0; i < n; i++) inorder[i] = sc.nextInt();
            for (int i = 0; i < n; i++) postorder[i] = sc.nextInt();
            GfG g = new GfG();
            Node root = g.buildTree(inorder, postorder, n);
            ip.preOrder(root);
            System.out.println();

            T--;
        }
    }
}

class GfG {

   static int postIndex;
    Node buildTree(int in[], int post[], int n) {

       postIndex=n-1;
        HashMap<Integer,Integer> hm= new HashMap<>();
        for (int i=0;i<n;i++)
        {
            hm.put(in[i],i);
        }

        Node result= tree(in,post,0,n-1,hm );
        postIndex=0;
        return  result;

    }

    public  static  Node tree(int ino[], int post[], int st, int end,HashMap<Integer,Integer> hm )
    {
        if (st >end ) {
            return null;
        }
        Node temp=new Node(post[postIndex]);
        postIndex--;
        if (st==end)
        {
            return temp;
        }

        int inInd = hm.get(temp.data);
        temp.right= tree(ino,post,inInd+1,end,hm);
        temp.left=  tree(ino,post,st,inInd-1,hm);
        return temp;
    }
}

*/