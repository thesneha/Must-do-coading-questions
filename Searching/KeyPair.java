package Searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class KeyPair {

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
            Arrays.sort(arr);
            int start=0;
            int end=n-1;
            int count=0;
            for (int i=0;i<n;i++)
            {
                if (arr[start]+arr[end]==k&&start<end)
                {
                    count++;
                    System.out.println("Yes");
                    break;
                }
                 if (arr[start]+arr[end]>k&&start<end)
                {
                    end--;
                }
                if (arr[start]+arr[end]<k&&start<end){
                    start++;
                }
            }
            if (count==0)
            {
                System.out.println("No");
            }
            cases--;
        }
    }

}
