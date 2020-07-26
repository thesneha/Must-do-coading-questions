package Tree;
/*

import java.util.*;


class PostOrder
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int  T = sc.nextInt();
        while(T>0)
        {
            int N = sc.nextInt();
            int pre[] = new int[N];
            int in[] = new int[N];
            for(int i=0;i<N;i++)
                in[i]=sc.nextInt();
            for(int i=0;i<N;i++)
                pre[i]=sc.nextInt();
            GfG g = new GfG();
            g.printPostOrder(in,pre,N);
            System.out.println();
            T--;
        }
    }
}
class GfG
{
    static  int  preIndex=0;
    void printPostOrder(int in[], int pre[], int n)
    {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i=0;i<n;i++)
        {
            hm.put(in[i],i);
        }
        Node res= buildTree(in ,pre,0,n-1,hm);
        printTree(res);
        preIndex=0;


    }

    public  Node buildTree(int []in,int[]pre,int start,int end,HashMap<Integer,Integer> hm)
    {
        if (start >end ) {
            return null;
        }
        Node temp=new Node(pre[preIndex]);
        preIndex++;
        if (start==end)
        {
            return temp;
        }

        int inInd = hm.get(temp.data);
        temp.left= buildTree(in,pre,start,inInd-1,hm);
        temp.right=  buildTree(in,pre,inInd+1,end,hm);
        return temp;
    }


    public void printTree(Node res)
    {
        if (res!=null)
        {
            printTree(res.left);
            printTree(res.right);
            System.out.print(res.data+" ");
        }
    }
}

class  Node
{
    int data;
    Node left=null;
    Node right=null;
    public  Node(int data)
    {
        this.data=data;
    }

}
*/