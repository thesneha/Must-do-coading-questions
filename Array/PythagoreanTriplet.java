package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class PythagoreanTriplet {
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

            HashMap<Integer,Integer> hm= new HashMap<>();
            for (int i=0;i<length;i++)
            {
                hm.put(arr[i]*arr[i],arr[i]);
            }
            int count=0;
            for (int i=0;i<length;i++)
            {
                for (int j=i+1;j<length-1;j++)
                {
                    if (hm.containsKey(arr[i]*arr[i]+arr[j]*arr[j]))
                    {
                        System.out.println("Yes");
                        count++;
                        break;
                    }
                }
                if (count==1)
                {
                    break;
                }
            }
            if (count==0)
            {
                System.out.println("No");
            }
            cases--;
        }
    }
}

