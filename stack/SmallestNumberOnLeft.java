package stack;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class SmallestNumberOnLeft {
    public  static void  main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        int cases=sc.nextInt();
        while (cases>0)
        {
            int length=sc.nextInt();
            int arr[]=new int[length];
            for (int i=0;i<length;i++)
            {
                arr[i]=sc.nextInt();
            }

            int result[]= new int[length];
            Arrays.fill(result,-1);
            Stack<Integer> st= new Stack<>();
            for (int i=length-1;i>=0;i--)
            {
                while (!st.isEmpty()&&arr[i]<arr[st.peek()])
                {
                    result[st.pop()]=arr[i];
                }
                st.push(i);
            }
            for (int x:result)
            {
                System.out.print(x+" ");
            }
            System.out.println();
            cases--;
        }
    }


}
