package Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TripletSumInArray {

    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(b.readLine());
        while (cases > 0) {

            int n = Integer.parseInt(b.readLine());

            int[] arr = new int[n];
            String[] stri = b.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(stri[i]);
            }
            Arrays.sort(arr);
            int count=0;
            for (int i=0;i<n-2;i++)
            {
                int j=i+1;
                int  k=n-1;
                while (j<k)
                {
                    if (arr[i]+arr[j]+arr[k]>0)
                    {
                        k--;
                    }
                    else if (arr[i]+arr[j]+arr[k]==0)
                    {
                        count++;
                        break;
                    }
                    else {
                        j++;
                    }
                }
                if (count==1)
                {
                    break;
                }
            }
            if (count==0)
            {
                System.out.println("0");
            }
            else {
                System.out.println("1");
            }
            cases--;
        }
    }
}
