package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MaximumGap {
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
            Arrays.sort(arr);
            int max=Integer.MIN_VALUE;
            if (length==1)
            {
                System.out.println(arr[0]);
            }
            else {
                for (int i = 0; i < length - 1; i++) {

                    if (arr[i + 1] - arr[i] > max) {
                        max = arr[i + 1] - arr[i];
                    }
                }
                System.out.println(max);
            }
            cases--;
        }
    }
}
