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
class TreeNode{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            if(n==0){
                System.out.println(0);
                continue;
            }
            Node root = null;
            for(int i=0;i<n;i++){
                int a=sc.nextInt();
                int a1=sc.nextInt();
                char lr=sc.next().charAt(0);
                if(i==0){
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
            //inorder(root);
            GfG g=new GfG();
            System.out.println(g.minLeafSum(root));
        }
    }
    public static void insert(Node root,int a,int a1,char lr){
        if(root==null){
            return;
        }
        if(root.data==a){
            switch(lr){
                case 'L':root.left=new Node(a1);
                    break;
                case 'R':root.right=new Node(a1);
                    break;
            }
            return;
        }
        insert(root.left,a,a1,lr);
        insert(root.right,a,a1,lr);
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
}

class GfG{
    public int minLeafSum(Node root){
        Queue<Node> q= new LinkedList<>();
        q.add(root);
        int level=0;
        int sum=0;
        int count=0;
        int dummy=0;
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

                    if (temp.left == null && temp.right == null) {
                        if (count==0) {
                        sum = sum + temp.data;
                        dummy++;


                    }
                }

                nodes--;
            }
            if (dummy!=0)
            {
                count++;
            }

            level++;
        }
        return sum;
    }
}*/