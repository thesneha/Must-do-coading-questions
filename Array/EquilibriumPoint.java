package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EquilibriumPoint {

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

            int arrSum=0;
            int preSum=arr[0];
            int count=0;
            for (int i=0;i<length;i++)
            {
                arrSum=arrSum+arr[i];
            }
            if (length==1)
            {
                System.out.println("1");
            }
            else {
                for (int i = 1; i < length; i++) {
                    if (arrSum - preSum - arr[i] == preSum) {
                        System.out.println(i + 1);
                        count++;
                        break;
                    } else {
                        preSum = preSum + arr[i];
                    }
                }
                if (count == 0) {
                    System.out.println("-1");
                }
            }
            cases--;

        }
    }

}
