package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoNumbersWithSumClosestToZero {
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
            int i=0;
            int j=length-1;
            Arrays.sort(arr);
            int maxSum=arr[i]+arr[j];
            while (i<j)
            {
                int sum=arr[i]+arr[j];
                maxSum=closeToZero(sum,maxSum);
                if (sum>0)
                {
                    j--;
                }
                else {
                    i++;
                }

            }
            System.out.println(maxSum);
           cases--;
        }

    }
    public static int closeToZero(int a,int b) {
        int x = 0 - a;
        int y = 0 - b;
        int z = Math.min(Math.abs(x), Math.abs(y));
        if (Math.abs(x) == Math.abs(y)) {
            return b;
        } else {
            if (z == Math.abs(x)) {
                return a;
            } else {
                return b;
            }

        }
    }
}
