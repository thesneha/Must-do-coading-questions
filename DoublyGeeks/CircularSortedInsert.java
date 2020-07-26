package DoublyGeeks;


import java.util.*;
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
class LL{
    Node head;
    public void addToTheLast(Node node) {

        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = node;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0) {
            int n = sc.nextInt();
            LL llist = new LL();
            llist.head=null;
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++) {
                int a = sc.nextInt();
                llist.addToTheLast(new Node(a));
            }
            int value=sc.nextInt();
            Node phead=head;
            while(phead.next!=null){
                phead=phead.next;
            }
            phead.next=head;
            GfG g=new GfG();
            g.insert(head,value,n);
            System.out.println();
        }
    }
}


class GfG
{
    public static void insert(Node zhead,int value,int n)
    {
        Node temp=zhead;
        int count=0;
        int x=0;
        int a=0;

        Node newNOde=new Node(value);
        while (a<n)
        {
            if (temp.data>value)
            {
                Node xx=temp;
                while (xx.next!=zhead)
                {
                    xx=xx.next;
                }
                newNOde.next=xx.next;
                xx.next=newNOde;
                zhead=xx.next;
                break;
            }
            if (temp.data<=value&&temp.next.data>=value)
            {
                newNOde.next=temp.next;
                temp.next=newNOde;

               break;

            }
            if (temp.data<value)
            {
                count++;
                if (count==n)
                {
                    newNOde.next=temp.next;
                    temp.next=newNOde;
                    break;

                }

            }
            temp=temp.next;
            a++;
        }

        while (x<=n)
        {
            System.out.print(zhead.data+" ");
            zhead=zhead.next;
            x++;
        }
    }
}