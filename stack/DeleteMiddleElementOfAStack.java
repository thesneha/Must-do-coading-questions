package stack;


import java.io.*;
import java.util.*;

class GFG {
    public static void main (String[] args) {

        Scanner sc=new Scanner(System.in);

        int testcases=sc.nextInt();

        while(testcases-->0)
        {
            int sizeOfStack =sc.nextInt();

            Stack <Integer> myStack=new Stack<>();

            for(int i=0;i<sizeOfStack;i++)
            {
                int x=sc.nextInt();
                myStack.push(x);

            }

            if(sizeOfStack==1)
            {
                System.out.println(myStack.peek());
            }
            else
            {
                Geeks obj=new Geeks();
                Stack <Integer> modified=obj.deleteMid(myStack,sizeOfStack,0);

                while(!modified.isEmpty())
                {
                    System.out.print(modified.peek()+" ");
                    modified.pop();
                }
                System.out.println();
            }
        }
    }
}

class Geeks
{
    Stack <Integer> ss=new Stack<>();
    int i=0;
    public Stack<Integer> deleteMid(Stack<Integer>s,int sizeOfStack,int current)
    {
        while (i<sizeOfStack/2)
        {
            ss.push(s.pop());
            i++;
        }
        s.pop();

        while (!ss.isEmpty())
        {
            s.push(ss.pop());
        }
        return s;


    }
}
