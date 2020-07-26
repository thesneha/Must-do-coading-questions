package LinkedList;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Sort {
    public static  void main(String[]args)
    {
        LinkedList <Integer> ll= new LinkedList<>();
        ll.add(50);
        ll.add(20);
        ll.add(10);
        ll.add(40);
        ll.add(100);
        Collections.sort(ll,new Sortbyroll());
    }

}


class Sortbyroll implements Comparator<Integer>
{
    // Used for sorting in ascending order of
    // roll number
    public int compare( Integer a,Integer b)
    {
        return 1;
    }
}