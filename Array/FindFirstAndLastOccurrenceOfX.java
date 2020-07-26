package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindFirstAndLastOccurrenceOfX {

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
            int x=Integer.parseInt(b.readLine());
            int count=0;
            int lastIndex=0;
            int count1=0;
            String sRes ="";
            for (int i=0;i<length;i++)
            {
                if (arr[i]==x&&count==0)
                {
                    count++;
                    sRes=sRes+i;
                }
                if (arr[i]==x)
                {
                    lastIndex=i;
                }
               else {
                   count1++;
                }

            }

            sRes=sRes+" "+lastIndex;
            if (count1==length)
            {
                System.out.println("-1");
            }
            else {
                System.out.println(sRes);
            }
            cases--;
        }
    }


}
