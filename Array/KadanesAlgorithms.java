package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KadanesAlgorithms {
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

            int max=arr[0];
            int currentMax=arr[0];
            for (int i=1;i<arr.length;i++)
            {
                currentMax=Math.max(arr[i],arr[i]+currentMax);
                max=Math.max(max,currentMax);
            }
            System.out.println(max);
            cases--;
        }
    }

}
