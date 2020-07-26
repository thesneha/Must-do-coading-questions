package Searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoRepeatedElements {

    public static void main(String[] args) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(b.readLine());
        while (cases > 0) {
            int length = Integer.parseInt(b.readLine());
            String s[] = b.readLine().split(" ");
            int arr[] = new int[length+3];
            for (int i = 0; i < length+2; i++) {
                arr[i] = Integer.parseInt(s[i]);
            }
            for (int i=0;i<length+3;i++)
            {
                if (arr[Math.abs(arr[i])]>=0)
                {
                    arr[Math.abs(arr[i])]=-arr[Math.abs(arr[i])];
                }
                else
                {
                    System.out.print(Math.abs(arr[i])+" ");
                }
            }
            System.out.println();
            cases--;

        }

    }

}
