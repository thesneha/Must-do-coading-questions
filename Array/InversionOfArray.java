package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InversionOfArray {
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

            int count=0;
            for (int i=0;i<length-1;i++)
            {
                for (int j=i+1;j<length;j++)
                {
                    if (arr[i]>arr[j])
                    {
                        count++;
                    }
                }
            }
            System.out.println(count);
            cases--;
        }
    }

}
