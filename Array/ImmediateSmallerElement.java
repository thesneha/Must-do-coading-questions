package Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ImmediateSmallerElement {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(b.readLine());
        while (cases > 0) {
            int length = Integer.parseInt(b.readLine());
            int[] arr = new int[length];
            String[] stri = b.readLine().split(" ");
            arr[0]=Integer.parseInt(stri[0]);
            for (int i = 1; i <length; i++) {
                arr[i] = Integer.parseInt(stri[i]);
                if (arr[0]>arr[i])
                {
                    System.out.print(arr[i]+" ");
                }
                else {
                    System.out.print("-1"+" ");
                }
                arr[0]=arr[i];
            }
            System.out.println("-1");
            cases--;
        }
    }
}
