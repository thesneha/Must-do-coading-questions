package Tree;

/*import java.util.*;
        import java.util.Scanner;
        import java.util.HashMap;
        import java.lang.Math;
class Node
{
    int data;
    Node left,right;
    Node(int d) {data = d; left =right= null; }
}

class GFG2
{
    public static void inorder(Node root)
    {
        if(root==null)
            return;
        inorder(root.left);
        System.out.print(root.data);
        inorder(root.right);
    }
    /* Drier program to test above functions */
  /*  public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0)
        {
            int n = sc.nextInt();
            GFG2 llist=new GFG2();
            Node root=null,parent=null;
            HashMap<Integer, Node> m = new HashMap<>();
            for(int i=0;i<n;i++)
            {
                int a=sc.nextInt();
                int b=sc.nextInt();
                char c=sc.next().charAt(0);
                if(m.containsKey(a)==false)
                {
                    parent=new Node(a);
                    m.put(a,parent);
                    if(root==null)
                        root=parent;
                }
                else
                    parent=m.get(a);
                Node child=new Node(b);
                if(c=='L')
                    parent.left=child;
                else
                    parent.right=child;
                m.put(b,child);
            }
            GFG obj = new GFG();
            int Max=obj.findMax(root);
            int Min=obj.findMin(root);
            System.out.println(Max+" "+Min);
        }
    }
}
class GFG
{
    public static int findMax(Node root)
    {
       int max=Integer.MIN_VALUE;
       Queue<Node> q= new LinkedList<>();
       q.add(root);
       while (!q.isEmpty())
       {
           Node n= q.poll();
           if (n.left!=null)
           {
               q.add(n.left);

           }
           if (n.right!=null)
           {
               q.add(n.right);

           }
           if (n.data>max)
           {
               max=n.data;
           }
       }
       return max;

    }
    public static int findMin(Node root)
    {
        int min=Integer.MAX_VALUE;
        Queue<Node> q= new LinkedList<>();
        q.add(root);
        while (!q.isEmpty())
        {
            Node n= q.poll();
            if (n.left!=null)
            {
                q.add(n.left);

            }
            if (n.right!=null)
            {
                q.add(n.right);

            }
            if (n.data<min)
            {
                min=n.data;
            }
        }
        return min;
    }
}*/
