package Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class JumpingCaterpillars {

    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(b.readLine());
        while (cases > 0) {
            String[] ss = b.readLine().split(" ");
            int n = Integer.parseInt(ss[0]);
            int k = Integer.parseInt(ss[1]);
            int[] arr = new int[k];
            String[] stri = b.readLine().split(" ");
            for (int i = 0; i < k; i++) {
                arr[i] = Integer.parseInt(stri[i]);
            }
            int result[]=new int [n];

            for (int i=0;i<k;i++)
            {
                for (int j=1;arr[i]*j<=n;j++)
                {
                    result[(arr[i]*j)-1]=1;
                }
            }
            int count=0;
            for (int i=0;i<n;i++)
            {
                if (result[i]==0)
                {
                    count++;
                }
            }
            System.out.println(count);
            cases--;
        }

    }
}

