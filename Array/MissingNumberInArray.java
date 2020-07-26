package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MissingNumberInArray {
    public static void main(String[] args) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(b.readLine());
        while (cases > 0) {
            int length = Integer.parseInt(b.readLine());
            String s[] = b.readLine().split(" ");
            int arr[] = new int[length - 1];
            for (int i = 0; i < length - 1; i++) {
                arr[i] = Integer.parseInt(s[i]);
            }
            Arrays.sort(arr);
            int count=0;
            for (int i=0;i<length-1;i++)
            {
                if (arr[i]==i+1)
                {
                    count++;

                }
                else {
                    System.out.println(i+1);
                    break;
                }
            }
            if (count==arr.length)
            {
                System.out.println(arr.length+1);
            }
            cases--;


        }

    }
}

