package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RearrangeArrayAlternately {

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
            int res[]=new int[length];
            if (length%2==0)
            {
                int index=0;
                int j=length-1;
                for (int i=0;i<length/2;i++)
                {
                    res[index]=arr[j];
                    j--;
                    index++;
                    res[index]=arr[i];
                    index++;
                }

            }
            else {
                int index=0;
                int j=length-1;
                for (int i=0;i<length/2;i++)
                {
                    res[index]=arr[j];
                    j--;
                    index++;
                    res[index]=arr[i];
                    index++;
                }
                res[index]=arr[j];
            }

            for (int x:res)
            {
                System.out.print(x+" ");
            }
            System.out.println();
            cases--;
        }
    }

}
