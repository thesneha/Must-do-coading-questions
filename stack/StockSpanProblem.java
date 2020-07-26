package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class GFG11
{
    public static void main (String[] args) throws IOException
    {
        BufferedReader b =new BufferedReader(new InputStreamReader(System.in));
        int cases= Integer.parseInt(b.readLine());
        while (cases>0)
        {
            int n=Integer.parseInt(b.readLine());;
            String arr[]=b.readLine().split(" ");
            int arr1[]= new int[n];
            for (int i=0;i<n;i++)
            {
                arr1[i]=Integer.parseInt(arr[i]);
            }
            int result[]= new int[n];
            Stack<Integer>s= new Stack();
            result[0]=1;
            s.push(0);
            for (int i=1;i<n;i++)
            {
                while (!s.isEmpty())
                {
                    if (arr1[s.peek()]>arr1[i])
                    {
                        result[i]=i-s.peek();
                        break;
                    }
                    else {
                        s.pop();
                    }
                }
                if (s.isEmpty())
                {
                    result[i]=i+1;
                }
                s.push(i);
            }

            for (int i:result)
            {
                System.out.print(i+" ");
            }
            System.out.println();
            cases--;

        }
    }
}

