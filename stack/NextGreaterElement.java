package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) throws IOException {

        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(b.readLine());
        while (length > 0) {
            int size = Integer.parseInt(b.readLine());
            String[] s = b.readLine().split(" ");
            long arr[] = new long[size];
            for (int i = 0; i < size; i++) {
                arr[i] = Long.parseLong(s[i]);
            }

            long[] result= new long[size];
            Arrays.fill(result,-1);
            Stack <Integer> st= new Stack();
            for (int i=0;i<s.length;i++)
            {
                while (!st.isEmpty()&&arr[st.peek()]<arr[i])
                {
                    result[st.pop()]=arr[i];
                }
                st.push(i);
            }

            for (long x:result)
            {
                System.out.print(x+" ");
            }
            System.out.println();
            length--;
        }
    }
}
