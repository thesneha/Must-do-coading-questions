package Tree;

/*
import java.util.*;

class Node
{
    int data;
    Node left, right;
    Node(int key)
    {
        data = key;
        left = right = null;
    }
}

class BuildTree
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0)
        {
            int n = sc.nextInt();
            Node root = null;
            int ino[] = new int[n];
            int pre[] = new int[n];
            for(int i = 0; i < n; i++)
                ino[i] = sc.nextInt();

            for(int i = 0; i < n; i++)
                pre[i] = sc.nextInt();

            GfG gfg = new GfG(0);
            root = gfg.buildTree(ino, pre, 0, n-1);
            postOrdrer(root);
            System.out.println();
        }
    }

    public static void postOrdrer(Node root)
    {
        if(root == null)
            return;

        postOrdrer(root.left);
        postOrdrer(root.right);
        System.out.print(root.data + " ");
    }
}


class GfG
{
    public static int preIndex;

    GfG(int ind)
    {
        preIndex = ind;
    }

    public static Node buildTree(int ino[], int pre[], int st, int end)
    {

        Node result= tree(ino,pre,st,end );
        return  result;
    }

    public  static  Node tree(int ino[], int pre[], int st, int end )
    {
        if (st >end ) {
            return null;
        }
        Node temp=new Node(pre[preIndex]);
        preIndex++;
         if (st==end)
         {
             return temp;
         }

        int inInd = search(ino ,st, end, temp.data);
        temp.left= tree(ino,pre,st,inInd-1);
        temp.right=  tree(ino,pre,inInd+1,end);


        return temp;

    }
   static int search(int arr[], int strt, int end, int value)
    {
        int i;
        for (i = strt; i <= end; i++) {
            if (arr[i] == value)
                return i;
        }
        return i;
    }


}
*/