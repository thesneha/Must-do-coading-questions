package Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KthElementOfTwoSortedArrays {

    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(b.readLine());
        while (cases > 0) {
            String[] ss = b.readLine().split(" ");
            int n1 = Integer.parseInt(ss[0]);
            int n2 = Integer.parseInt(ss[1]);
            int k = Integer.parseInt(ss[2]);

            int[] arr1 = new int[n1];
            String[] stri1 = b.readLine().split(" ");
            for (int i = 0; i < n1; i++) {
                arr1[i] = Integer.parseInt(stri1[i]);
            }
            int[] arr2 = new int[n2];
            String[] stri2 = b.readLine().split(" ");
            for (int i = 0; i < n2; i++) {
                arr2[i] = Integer.parseInt(stri2[i]);
            }
            int result[]=new int[n1+n2];
            int i=0,j=0,x=0;

            while (i<n1&&j<n2)
            {
                if (arr1[i]<arr2[j])
                {
                    result[x]=arr1[i];
                    i++;
                    x++;
                }
                else {
                    result[x]=arr2[j];
                    j++;
                    x++;
                }
            }
            while (i<n1)
            {
                result[x]=arr1[i];
                i++;
                x++;
            }
            while (j<n2)
            {
                result[x]=arr2[j];
                j++;
                x++;
            }
            System.out.println(result[k-1]);
            cases--;

        }
    }

}
