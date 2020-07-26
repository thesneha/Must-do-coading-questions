package Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class ReverseArrayInGroups {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(b.readLine());
        while (cases > 0) {
            String[] ss = b.readLine().split(" ");
            int n = Integer.parseInt(ss[0]);
            int k = Integer.parseInt(ss[1]);
            int[] arr = new int[n];
            String[] stri = b.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(stri[i]);
            }
            Stack<Integer> st= new Stack<>();
            StringBuffer sb=new StringBuffer();

             int index=0;
             for (int i=0;i<n;i++)
             {
                 int count=0;
                 index=i;
                 while (count!=k&&i<=n-1)
                 {
                     st.push(arr[i]);
                     count++;
                     i++;
                 }
                 i--;
                 while (!st.isEmpty())
                 {
                     arr[index]=st.pop();
                     index++;
                 }
             }
             for (int x:arr)
             {
                sb.append(x);
             }
             System.out.println(sb);
             cases--;
        }
    }
}
