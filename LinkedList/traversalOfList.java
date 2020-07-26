package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class traversalOfList {
    public  static  void  main(String[]args)
    {
        List<Integer> l= new ArrayList<>() ;
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        for (int i=0;i<l.size();i++)
        {
            System.out.println(l.get(i));
        }

        List<Integer> l2= new LinkedList<>() ;
        l2.add(10);
        l2.add(20);
        l2.add(30);
        l2.add(40);
        for (int i=0;i<l2.size();i++)
        {
            System.out.println(l2.get(i));
        }

        Stack<String> stack = new Stack<String>();
        stack.add("Ayush");
        stack.add("Garvit");
        stack.add("Amit");
        stack.add("Ashish");
        stack.add("Garima");
        for (int i=0;i<stack.size();i++)
        {
            System.out.println(stack.get(i));
        }
    }

}
