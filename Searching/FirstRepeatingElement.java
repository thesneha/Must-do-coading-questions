package Searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

public class FirstRepeatingElement {
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
            LinkedHashMap<Integer,Integer> lhm= new LinkedHashMap<>();
            for (int i=0;i<length;i++)
            {
                if (lhm.containsKey(arr[i]))
                {
                    lhm.put(arr[i],lhm.get(arr[i])+1);
                }
                else {
                    lhm.put(arr[i],1);
                }
            }
             int count=0;
            int max=1;
            int index=0;
            for (int i=0;i<length;i++)
            {
                if (lhm.get(arr[i])>max)
                {
                    index=i+1;
                    count++;
                    break;

                }
            }
            if (count==0)
            {
                System.out.println("-1");
            }

            else {
                System.out.println(index);
            }
            cases--;
        }
    }

}
