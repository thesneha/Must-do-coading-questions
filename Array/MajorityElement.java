package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

public class MajorityElement {

    public static void main(String[] args) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(b.readLine());
        while (cases > 0) {
            int length = Integer.parseInt(b.readLine());
            String s[] = b.readLine().split(" ");
            int arr[] = new int[length ];
            for (int i = 0; i < length ; i++) {
                arr[i] = Integer.parseInt(s[i]);
            }
            LinkedHashMap<Integer,Integer> l= new LinkedHashMap<>();
            for (int i=0;i<length;i++)
            {
                if (l.containsKey(arr[i]))
                {
                    l.put(arr[i],l.get(arr[i])+1);
                }
                else {
                    l.put(arr[i],1);
                }
            }
            int count=0;

            for (int i=0;i<arr.length;i++)
            {
                if (l.get(arr[i])>arr.length/2)
                {
                    System.out.println(arr[i]);
                    count++;
                    break;
                }
            }
            if (count==0)
            {
                System.out.println("-1");
            }
            cases--;
        }
    }

}
