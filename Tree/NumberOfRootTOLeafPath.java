package Tree;
/*

import sun.reflect.generics.tree.Tree;

import java.util.*;
import java.io.*;
import java.lang.*;

class Node
{
    int data;
    Node left, right;
    Node(int d)
    {
        data = d;
        left = right = null;
    }
}
class Roof_To_Leaf_Paths_Having_Equal_Length
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int n = sc.nextInt();
            HashMap<Integer, Node> hm = new HashMap<Integer,Node>();
            Node root = null;
            while(n>0)
            {
                int n1 = sc.nextInt();
                int n2 = sc.nextInt();
                char ch = sc.next().charAt(0);

                Node parent = hm.get(n1);
                if(parent == null)
                {
                    parent = new Node(n1);
                    hm.put(n1,parent);
                    if(root == null)
                    {
                        root = parent;
                    }
                }

                Node child = new Node(n2);
                if(ch == 'L')
                    parent.left = child;
                else
                    parent.right = child;

                hm.put(n2,child);

                n--;
            }

            GfG g = new GfG();
            g.countPaths(root);
            System.out.println();

            t--;
        }
    }
}



class GfG {
    void countPaths(Node root) {
        Queue<Node> q = new LinkedList<>();
        Map<Integer,Integer> tm = new TreeMap<>();
        if (root != null) {
            q.add(root);
            int level = 1;
            int count=0;
            while (!q.isEmpty()) {
                int nodes = q.size();
                while (nodes > 0) {
                    Node temp = q.poll();
                    if (temp.left != null) {
                        q.add(temp.left);
                    }
                    if (temp.right != null) {
                        q.add(temp.right);
                    }
                    if (temp.left==null&&temp.right==null)
                    {
                        count++;
                        if (tm.containsKey(level))
                        {
                            tm.put(level,tm.get(level)+1);
                        }
                        else {
                            tm.put(level,1);
                        }
                    }

                    nodes--;
                }
                level++;
                count = 0;
            }

            for (Map.Entry<Integer,Integer> x:tm.entrySet())
            {
                int key=x.getKey();
                int value= x.getValue();
                System.out.print(key+" "+value+" "+"$");
            }

        }
    }
}

*/