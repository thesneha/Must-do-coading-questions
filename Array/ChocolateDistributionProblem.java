package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ChocolateDistributionProblem {

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
            int noOfStudents= Integer.parseInt(b.readLine());
            Arrays.sort(arr);
            int min=arr[noOfStudents-1]-arr[0];
            int i=1;
            int j=noOfStudents;
            for ( i=1;i<length-noOfStudents+1;i++)
            {
                if (arr[j]-arr[i]<min)
                {
                    min=arr[j]-arr[i];

                }
                j++;

            }
            System.out.println(min);
            cases--;
        }
    }

}
