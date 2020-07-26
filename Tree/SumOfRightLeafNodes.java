package Tree;

/*
import java.util.Scanner;
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
class SumOfLeft{
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
            int ans=g.rightLeafSum(root);
            System.out.println(ans);
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
    public int rightLeafSum(Node root)
    {

        int res=0;
        if (root!=null)
        {
            res=res+rightLeafSum(root.left);
            if (isLeave(root.right)) {
                res = res + root.right.data;
            }
            else {
                res = res + rightLeafSum(root.right);
            }
        }
        return res;

    }
    public  boolean isLeave(Node node)
    {

        if (node==null)
        {
            return false;
        }
        if (node.left==null&&node.right==null)
        {
            return true;
        }
        else {
            return false;
        }
    }
}
*/