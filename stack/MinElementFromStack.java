package stack;


import java.util.*;

class Get_Min_From_Stack
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0)
        {
            int q = sc.nextInt();
            GfG1 g = new GfG1();
            while(q>0)
            {
                int qt = sc.nextInt();

                if(qt == 1)
                {
                    int att = sc.nextInt();
                    g.push(att);
                    //System.out.println(att);
                }
                else if(qt == 2)
                {
                    System.out.print(g.pop()+" ");
                }
                else if(qt == 3)
                {
                    System.out.print(g.getMin()+" ");
                }

                q--;
            }
            System.out.println();
            T--;
        }

    }
}


// } Driver Code Ends
class GfG1
{
    int minEle;
    Stack<Integer> s = new Stack<>();

    /*returns min element from stack*/
    int getMin()
    {
        int arr[]= new int [s.size()];
        int l=s.size();
        for (int i=0;i<l;i++)
        {
            arr[i]=s.pop();
        }
        int min=Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];

            }
        }
        for (int i=arr.length-1;i>=0;i--)
        {
            s.push(arr[i]);
        }

        if (min==Integer.MAX_VALUE)
        {
            return -1;
        }
        else return min;

    }

    int pop() {
        if (!s.isEmpty()) {
            return s.pop();
        }
        return -1;
    }

    void push(int x)
    {
      s.push(x);
    }
}

