package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class SubarraysWithGivenSum {


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
            int k=Integer.parseInt(b.readLine());

            int count=0;
            int currentSum=0;
            HashMap<Integer,Integer> hm= new HashMap<>();
            for (int i=0;i<length;i++)
            {
                currentSum=currentSum+arr[i];

                if (currentSum==k)
                {
                    count=count+1;
                }
                if (hm.containsKey(currentSum-k))
                {
                    count=count+hm.get(currentSum-k);

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
