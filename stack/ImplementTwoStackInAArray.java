package stack;

import java.util.*;

class TwoStack
{

    int size;
    int top1,top2;
    int arr[] = new int[100];

    TwoStack()
    {
        int n =100;
        size = n;
        //arr[] = new int[n];
        top1 = -1;
        top2 = size;
    }


    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0)
        {
            TwoStack sq = new TwoStack();

            int Q = sc.nextInt();
            while(Q>0)
            {
                int stack_no = sc.nextInt();
                int QueryType = sc.nextInt();

                Stacks g = new Stacks();

                if(QueryType == 1)
                {
                    int a = sc.nextInt();
                    if(stack_no == 1)
                        g.push1(a,sq);
                    else if(stack_no ==2)
                        g.push2(a,sq);
                }else if(QueryType == 2)
                {
                    if(stack_no==1)
                        System.out.print(g.pop1(sq)+" ");
                    else if(stack_no==2)
                        System.out.print(g.pop2(sq)+" ");
                }

                Q--;
            }
            System.out.println();
            T--;
        }
    }
}

class Stacks
{
    void push1(int x, TwoStack sq)
    {
        sq.top1++;
        sq.arr[sq.top1]=x;

    }

    void push2(int x, TwoStack sq)
    {
        sq.top2--;
        sq.arr[sq.top2]=x;

    }

    int pop1(TwoStack sq)
    {
        int x=sq.top1;
        if (x>=0)
        {
            sq.top1--;
            return sq.arr[x];

        }
        else {
            return -1;
        }

    }

    int pop2(TwoStack sq)
    {
        int x=sq.top2;
        if (x<sq.size)
        {
            sq.top2++;
            return sq.arr[x];

        }
        else {
            return -1;
        }

    }
}
