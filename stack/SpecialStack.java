package stack;

import java.util.Scanner;
import java.util.Stack;


class SpeStack
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            Stack<Integer> s=new Stack<>();
            GfG g=new GfG();
            while(!g.isFull(s,n)){
                g.push(sc.nextInt(),s);
            }
            System.out.println(g.min(s));
        }
    }
}

class GfG{
    int count=0;
    Stack <Integer>st= new Stack<>();
    public void push(int a,Stack<Integer> s)
    {
        if (s.isEmpty())
        {
            s.push(a);
            st.push(a);
            count++;
        }

        else {
            s.push(a);
            count++;
            if (a<=st.peek())
            {
                st.push(a);

            }
        }


    }
    public int pop(Stack<Integer> s)
    {
        if (s.peek()==st.peek())
        {
         st.pop();
         return s.pop();
        }
        else {
           return s.pop();
        }

    }


    public int min(Stack<Integer> s)
    {
        return st.peek();


    }
    public boolean isFull(Stack<Integer>s, int n)
    {
        if (count==n)
        {
            return true;
        }
        else {
            return false;
        }
    }
    public boolean isEmpty(Stack<Integer>s)
    {
        if (count==0)
        {
            return true;
        }
        else {
            return  false;
        }
    }
}