package LinkedList;

import org.omg.CORBA.NO_IMPLEMENT;

import java.util.*;

 class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Node head = null;
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                head = addToTheLast(new Node(a), head);
            }
            int k = sc.nextInt();
            Rotate g = new Rotate();
            head = g.rotate(head,
                    k); // rotate linked list anti-clockwise by k nodes
            printList(head);
        }
    }

    // insert function to build linked list
    public static Node addToTheLast(Node node, Node head) {
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = node;
        }
        return head;
    }

    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
}

class Rotate {

    public Node rotate(Node head, int k) {

        Node current = head;
        Node x = head;
        Node temp = null;
        Node temp1 = null;
        int count = 0;
        int count1 = 0;
        while (x != null) {
            count1++;
            x = x.next;
        }
        if (k == count1) {
            return head;
        }

        while (current != null) {
            count++;
            if (count == k) {
                temp = current.next;
                current.next = null;
                break;
            }
            current = current.next;
        }
        temp1 = temp;
        if (temp1.next == null) {
            temp1.next = head;
            return temp;

        } else {
            while (temp1.next != null) {
                temp1 = temp1.next;
            }
            temp1.next = head;
            return temp;
        }
    }
}