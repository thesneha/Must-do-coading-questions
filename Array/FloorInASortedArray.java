package Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FloorInASortedArray {

    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(b.readLine());
        while (cases > 0) {
            String[] ss = b.readLine().split(" ");
            int n = Integer.parseInt(ss[0]);
            int s = Integer.parseInt(ss[1]);
            int[] arr = new int[n];
            String[] stri = b.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(stri[i]);
            }
            int count=0;
            int larestSmaller=0;
            for (int i=0;i<n;i++)
            {
                if (arr[i]<=s&&arr[i]>arr[larestSmaller])
                {
                    larestSmaller=i;
                    count++;
                }
            }
            if (count==0)
            {
                System.out.println("-1");
            }
            else {
                System.out.println(larestSmaller);
            }
            cases--;
        }
    }
}
