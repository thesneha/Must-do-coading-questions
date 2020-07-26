package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class MaximumSumIncreasingSubsequence {

    public static void main(String[] args) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(b.readLine());
        while (cases > 0) {
            int length = Integer.parseInt(b.readLine());
            String s[] = b.readLine().split(" ");
            int arr[] = new int[length];
            for (int i = 0; i < length; i++) {
                arr[i] = Integer.parseInt(s[i]);
            }
            Stack<Integer> st=new Stack<>() ;
            int sum=arr[0];
            st.push(sum);
            for (int i=1;i<length;i++)
            {
                if (i<=length-1&&arr[i]>arr[i-1])
                {
                    while (i<=length-1&&arr[i]>arr[i-1])
                    {
                        sum=sum+arr[i];
                        st.push(sum);
                        i++;
                    }
                }
                int j=i-1;
                if (i<=length-1&&j>=0&&arr[i]<arr[j])
                {
                    while (i<=length-1&&j>=0&&arr[i]<arr[j]) {
                        sum = sum - arr[j];
                        j--;
                    }
                    sum=sum+arr[i];
                    st.push(sum);
                }
            }
            int max=Integer.MIN_VALUE;
            while (!st.isEmpty())
            {
                if (st.peek()>max)
                {
                    max=st.pop();
                }
                else {
                    st.pop();
                }
            }
            System.out.println(max);
            cases--;
        }
    }

}
