package Tree;

/*
import java.util.*;
import java.io.*;
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}


class GfG{

    public static void main(String[] args)throws IOException{
        //Scanner sc=new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t=Integer.parseInt(br.readLine());

        while(t > 0)
        {
            Queue<Node> q = new LinkedList<>();

            int n = Integer.parseInt(br.readLine());
            String input[] = br.readLine().trim().split(" ");

            Node root = null;
            int j=0;
            while(n > 0){
                int a1 = Integer.parseInt(input[j]);
                int a2 = Integer.parseInt(input[j+1]);
                char lr = input[j+2].charAt(0);
                j+=3;

                if(root == null)
                {
                    root = new Node(a1);
                    q.add(root);
                }

                Node pick = q.peek();

                q.remove();

                if(lr=='L'){
                    pick.left = new Node(a2);
                    q.add(pick.left);
                }
                a1 = Integer.parseInt(input[j]);
                a2 = Integer.parseInt(input[j+1]);
                lr = input[j+2].charAt(0);
                j += 3;

                if(lr=='R'){
                    pick.right = new Node(a2);
                    q.add(pick.right);
                }

                n-=2;
            }
            new View().topView(root);
            System.out.println();
            t--;
        }
    }
}




class View
{
    static void topView(Node root) {
        TreeMap<Integer, List<Integer>> tmap = new TreeMap<Integer, List<Integer>>();

        Queue q = new LinkedList<>();
        q.add(root);
        q.add(0);

        while (!q.isEmpty()) {
            int n = q.size();
            int x = n / 2;
            while (x > 0) {


                Node node = (Node) q.poll();
                int level = (Integer) q.poll();

                if (tmap.containsKey(level)) {
                    List<Integer> ll = tmap.get(level);
                    ll.add(node.data);
                    tmap.put(level, ll);
                } else {
                    List<Integer> li = new LinkedList<Integer>();
                    li.add(node.data);
                    tmap.put(level, li);
                }

                if (node.left != null) {
                    q.add(node.left);
                    q.add(level - 1);
                }
                if (node.right != null) {
                    q.add(node.right);
                    q.add(level + 1);
                }
                x--;
            }
        }

        for (Map.Entry e : tmap.entrySet()) {
            List list = (List) e.getValue();
            Iterator<Integer> i = list.iterator();

                while (i.hasNext()) {
                        System.out.print(i.next() + " ");
                        break;

                    }
                }
            }


    }
*/