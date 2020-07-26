package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PrintAnArrayInPendulumArrangement {

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
            Arrays.sort(arr);
            int result[]=new int[length];
            if (length%2==0)
            {
               int  mid= (length-1)/2;
                int i=0;
                int next=mid+1;
                int pre=mid-1;
                result[mid]=arr[i];
                i++;
                while (i<length-1)
                {
                    result[next]=arr[i];
                    i++;
                    next++;
                    result[pre]=arr[i];
                    pre--;
                    i++;

                }
                result[length-1]=arr[length-1];


            }
            else {
                int mid =length/2;
                int i=0;
                result[mid]=arr[i];
                int next=mid+1;
                int pre=mid-1;
                i++;
                while (i<length)
                {
                     result[next]=arr[i];
                     next++;
                     i++;
                     result[pre]=arr[i];
                     pre--;
                     i++;

                }


            }
            for (int x:result)
            {
                System.out.print(x+" ");
            }
            System.out.println();
            cases--;
        }
    }

}
