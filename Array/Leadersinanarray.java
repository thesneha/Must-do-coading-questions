package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Leadersinanarray {

    public static void main(String[] args) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(b.readLine());
        while (cases > 0) {
            int length = Integer.parseInt(b.readLine());
            String s[] = b.readLine().split(" ");
            int arr[] = new int[length ];
            for (int i = 0; i < length ; i++) {
                arr[i] = Integer.parseInt(s[i]);
            }
            int max=arr[length-1];
            StringBuilder sb= new StringBuilder();
            Stack<Integer> stack= new Stack<>();
           stack.push(arr[length-1]);
            for (int i=length-2;i>=0;i--)
            {
                if (arr[i]>=max)
                {
                    max=arr[i];
                    stack.push(arr[i]);
                }
            }
            while (!stack.isEmpty())
            {
                sb.append(stack.pop()+" ");
            }
            System.out.println(sb.toString());


            cases--;
        }
    }

}
