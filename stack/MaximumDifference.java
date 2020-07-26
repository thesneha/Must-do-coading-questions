package stack;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class MaximumDifference {
    public static void  main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        int cases= sc.nextInt();
        while (cases>0)
        {
            int length= sc.nextInt();
            int arr[]=new int[length];
            for (int i=0; i<length;i++)
            {
                arr[i]=sc.nextInt();
            }

            int arrLeft[]=new int[length];
            Arrays.fill(arrLeft,0);
            Stack<Integer> s1=new Stack<>();

            int arrRight[]=new int[length];
            Arrays.fill(arrRight,0);
            Stack<Integer> s2=new Stack<>();

            for (int i=arr.length-1;i>=0;i--)
            {
                while (!s1.isEmpty()&&arr[i]<arr[s1.peek()])
                {
                    arrLeft[s1.pop()]=arr[i];

                }
                s1.push(i);
            }

            for (int i=0;i<arr.length;i++)
            {
                while (!s2.isEmpty()&&arr[i]<arr[s2.peek()])
                {
                    arrRight[s2.pop()]=arr[i];

                }
                s2.push(i);
            }
            int max=Integer.MIN_VALUE;
            for (int i=0;i<arr.length;i++)
            {
                int diff=Math.abs(arrLeft[i]-arrRight[i]);
                if (diff>max)
                {
                    max=diff;
                }
            }
            System.out.println(max);
            cases--;
        }
    }


}
