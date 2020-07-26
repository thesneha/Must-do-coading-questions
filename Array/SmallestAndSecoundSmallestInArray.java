package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SmallestAndSecoundSmallestInArray {

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
            int smallest=Integer.MAX_VALUE;

            for (int i=0;i<length;i++)
            {
                if (arr[i]<smallest)
                {
                    smallest=arr[i];
                }

            }

            int count=0;
            int secoundSmallest=Integer.MAX_VALUE;
            int sec=0;
            for (int i=0;i<length;i++)
            {
                if (arr[i]!=smallest){
                     int x=arr[i]-smallest;
                     if (x<secoundSmallest)
                     {
                         secoundSmallest=x;
                         sec=arr[i];
                     }
                     count++;
                }
            }
            if (count==0)
            {
                System.out.println("-1");
            }
            else {
                System.out.println(smallest + " " + sec);
            }

            cases--;
        }
    }
}
