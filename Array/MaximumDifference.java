package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaximumDifference {

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

            int minElement=arr[0];
            int maxDifference=-1;
            for (int i=1;i<length;i++)
            {
                if (arr[i]-minElement>maxDifference)
                {
                    maxDifference=arr[i]-minElement;
                }
                if (arr[i]<minElement)
                {
                    minElement=arr[i];
                }

            }
            System.out.println(maxDifference);
            cases--;

        }
    }

}
