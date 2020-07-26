package Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class LongestSubArraywithSumK {

    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(b.readLine());
        while (cases > 0) {
            String[] ss = b.readLine().split(" ");
            int n = Integer.parseInt(ss[0]);
            int k = Integer.parseInt(ss[1]);
            int[] arr = new int[n];
            String[] stri = b.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(stri[i]);
            }
            int maxLength=0;
            int currentSum=0;
            HashMap<Integer,Integer> hm =new HashMap<>();
            for (int i=0;i<n;i++)
            {
                currentSum=currentSum+arr[i];

                if (arr[i]==k&&maxLength==0)
                {
                    maxLength=1;
                }
                if (currentSum==k)
                {
                    maxLength=i+1;
                }
                if (hm.containsKey(currentSum-k))
                {
                    maxLength=Integer.max(maxLength,i-hm.get(currentSum-k));
                }
                if (hm.containsKey(currentSum))
                {

                }
                else {
                    hm.put(currentSum,i);
                }
            }
            System.out.println(maxLength);
            cases--;

        }
    }

}
