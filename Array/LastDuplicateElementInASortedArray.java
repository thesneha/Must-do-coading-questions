package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LastDuplicateElementInASortedArray {
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
            int index=0;
            int count=0;
            for (int i=0;i<length-1;i++)
            {
                if (arr[i]==arr[i+1])
                {
                    index=i+1;
                    count++;
                }

            }
            if (count==0)
            {
                System.out.println("-1");
            }
            else {
                System.out.println(index + " " + arr[index]);
            }
            cases--;
        }
    }

}
