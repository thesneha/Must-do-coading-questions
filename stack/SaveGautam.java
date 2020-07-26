package stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class SaveGautam {
    public  static  void main(String[]args)
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
            Arrays.fill(result,0);
            Stack<Integer> st= new Stack<>();
            int sum=0;
            for (int i=0;i<length;i++)
            {
                while (!st.isEmpty()&&arr[st.peek()]<arr[i])
                {
                    sum=sum+arr[i];
                    sum=sum%1000000001;
                    st.pop();

                }
                st.push(i);
            }
            System.out.println(sum);
            cases--;
        }
    }

}
