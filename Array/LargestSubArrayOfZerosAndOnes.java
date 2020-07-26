package Array;

import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.util.HashMap;

class Largest_Subarray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int a[] = new int[N];
            for (int i = 0; i < N; i++) {
                a[i] = sc.nextInt();
            }

            GfG g = new GfG();
            int n = g.maxLen(a);

            System.out.println(n);

            T--;
        }
    }
}

class GfG {
    int maxLen(int[] arr) {

        HashMap<Integer,Integer> hm= new HashMap<>();
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]==0)
            {
                arr[i]=-1;
            }
        }
        int currentSum=0;
        int maxLength=0;
        for (int i=0;i<arr.length;i++)
        {
            currentSum=currentSum+arr[i];
            if (currentSum==0)
            {
                maxLength=i+1;
            }
            if (hm.containsKey(currentSum))
            {
                maxLength=Integer.max(maxLength,i-hm.get(currentSum));
            }
            else {
                hm.put(currentSum,i);
            }
        }
        return maxLength;
    }
}
