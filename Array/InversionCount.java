package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class InversionCOunt {
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

         long result=   mergeSortAndCount(arr,0,length-1);
            System.out.println(result);
            cases--;


        }
    }


    public static long mergeSortAndCount(int[] arr, int l, int r)
    {
        Long count = 0l;

        if (l < r) {
            int m = (l + r) / 2;

            count =count+ mergeSortAndCount(arr, l, m);

            count =count+ mergeSortAndCount(arr, m + 1, r);

            count =count+ mergeAndCount(arr, l, m, r);
        }

        return count;
    }
    static long mergeAndCount(int[] arr, int l, int m, int r)
    {

        int[] left = Arrays.copyOfRange(arr, l, m + 1);

        int[] right = Arrays.copyOfRange(arr, m + 1, r + 1);

        int i = 0, j = 0, k = l;

        long swaps = 0l;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j])
                arr[k++] = left[i++];
            else {
                arr[k++] = right[j++];
                swaps += (m + 1) - (l + i);
            }
        }

        while (i < left.length)
            arr[k++] = left[i++];

        while (j < right.length)
            arr[k++] = right[j++];

        return swaps;
    }

}
