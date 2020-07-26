package doublyLinkedList;


// { Driver Code Starts
import java.util.*;
import java.lang.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class ReverseInSize
{
    static Node head;

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            Node tail = head;
            for(int i = 1; i < n; i++)
            {
                int a = sc.nextInt();
                // addToTheLast(new Node(a));
                tail.next = new Node(a);
                tail =tail.next;
            }

            int k = sc.nextInt();
            GfG gfg = new GfG();
            Node res = gfg.reverse(head, k);
            printList(res);
            System.out.println();
        }
    }

    public static void addToTheLast(Node node)
    {
        if(head == null)
        {
            head = node;
        }
        else
        {
            Node temp = head;
            while(temp.next != null)
                temp = temp.next;
            temp.next = node;
        }
    }

    public static void printList(Node node)
    {
        while(node != null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

}


class GfG
{
    public static Node reverse(Node node, int k)
    {

        Stack<Node> s= new Stack();
        Node head=node;
        Node current=node;
        Node pre=null;
        while (current!=null)
        {
            int count =0;
            while (count<k&&current!=null)
            {
                s.push(current);
                current=current.next;
                count++;
            }

            while (s.size()>0) {
                if (pre == null)
                {
                    pre = s.pop();
                   head=pre;

                }
                else
                {

                    pre.next = s.pop();
                    pre=pre.next;
                }
            }

        }
        pre.next=null;
        return head;
    }
}

