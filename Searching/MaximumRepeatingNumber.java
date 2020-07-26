package Searching;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MaximumRepeatingNumber {

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
            int maxvalve=0;
            int maxindex=0;
            for (int i=0;i<n;i++)
            {
                int index=arr[i]%n;
                arr[index]=arr[index]+n;
            }
            for (int i=0;i<n;i++)
            {
                if (arr[i]/n>maxvalve)
                {
                    maxvalve=arr[i]/n;
                    maxindex=i;
                }
                if (arr[i]/n==maxvalve&&i<maxindex)
                {
                    maxindex=i;
                }

            }
            System.out.println(maxindex);
            cases--;
        }
    }

}
