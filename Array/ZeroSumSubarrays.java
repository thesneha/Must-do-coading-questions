package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public class ZeroSumSubarrays {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int cases = sc.nextInt();
        while (cases > 0) {
            int length = sc.nextInt();
            int arr[] = new int[length];
            for (int i = 0; i < length; i++) {
                arr[i] = sc.nextInt();
            }

            int count=0;
            int currentSum=0;
            HashMap<Integer,Integer> hm= new HashMap<>();
            for (int i=0;i<length;i++)
            {
                currentSum=currentSum+arr[i];

                if (currentSum==0)
                {
                    count=count+1;
                }
                if (hm.containsKey(currentSum))
                {
                    count=count+hm.get(currentSum);

                }
                if (hm.containsKey(currentSum))
                {
                    hm.put(currentSum,hm.get(currentSum)+1);

                }
                else
                {
                    hm.put(currentSum,1);

                }
            }
            System.out.println(count);
            cases--;
        }
    }

}
