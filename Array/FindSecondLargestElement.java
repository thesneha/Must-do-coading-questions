package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindSecondLargestElement {

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

            int largest=Integer.MIN_VALUE;
            for (int i=0;i<length;i++)
            {
                if (arr[i]>largest)
                {
                    largest=arr[i];
                }
            }

            int secoundLargest=largest;
            int intidiff=Integer.MAX_VALUE;

            for (int i=0;i<length;i++)
            {
                if (arr[i]!=largest)
                {
                  int  diff=largest-arr[i];
                    if (diff<intidiff)
                    {
                        intidiff=diff;
                        secoundLargest=arr[i];
                    }
                }
            }
            if (intidiff==Integer.MAX_VALUE)
            {
                System.out.println("-1");
            }
            else {
                System.out.println(secoundLargest);
            }
            cases--;
        }
    }

}
