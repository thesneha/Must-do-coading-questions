package DoublyGeeks;




// { Driver Code Starts
//Initial Template for Java

import java.util.*;
        import java.lang.*;
        import java.io.*;



class Driverclass
{
    public static void main (String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0)
        {
            int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            while(n-- > 1){
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }

            head = new LinkedList().segregate(head);
            printList(head);
            System.out.println();
        }
    }

    public static void printList(Node head)
    {
        if(head == null)
            return;

        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }


}


class LinkedList
{
    static Node segregate(Node head)
    {
        Node temp=head;
        Node temp2=head;
        int count0=0;
        int count1=0;
        int count2=0;
        while (temp!=null)
        {
            if (temp.data==0)
            {
                count0++;
            }
            if (temp.data==1)
            {
                count1++;
            }
            if (temp.data==2)
            {
                count2++;
            }
            temp=temp.next;
        }
        while (count0>0)
        {
            temp2.data=0;
            count0--;
            temp2=temp2.next;

        }
        while (count1>0)
        {
            temp2.data=1;
            count1--;
            temp2=temp2.next;

        }
        while (count2>0)
        {
            temp2.data=2;
            count2--;
            temp2=temp2.next;

        }
        return head;

    }
}


