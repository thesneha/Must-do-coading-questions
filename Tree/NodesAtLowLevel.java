package Tree;
/*

import java.util.*;
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
class NodeAtOdd{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            Node root=null;
            while(n-->0){
                int a=sc.nextInt();
                int a1=sc.nextInt();
                char lr=sc.next().charAt(0);
                if(root==null){
                    root=new Node(a);
                    switch(lr){
                        case 'L':root.left=new Node(a1);
                            break;
                        case 'R':root.right=new Node(a1);
                            break;
                    }
                }
                else{
                    insert(root,a,a1,lr);
                }
            }
            GfG g=new GfG();
            g.nodeAtOdd(root);
            System.out.println();
        }
    }
    public static void insert(Node root,int a,int a1,char lr){
        if(root==null)
            return;
        if(root.data==a){
            switch(lr){
                case 'L':root.left=new Node(a1);
                    break;
                case 'R':root.right=new Node(a1);
                    break;
            }
        }
        else{
            insert(root.left,a,a1,lr);
            insert(root.right,a,a1,lr);
        }
    }
}
class GfG{
    public void nodeAtOdd(Node root)
    {
        Queue<Node> q= new LinkedList<>();
        q.add(root);
        int level=1;

        while (!q.isEmpty())
        {
            int nodes=q.size();

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
                if (level%2!=0)
                {
                    System.out.print(temp.data+" ");
                }
                nodes--;
            }
            level++;
        }

    }
}
*/