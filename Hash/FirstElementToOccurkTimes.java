package Hash;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

public class FirstElementToOccurkTimes {
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
            LinkedHashMap<Integer,Integer> hm= new LinkedHashMap<>();
            for (int i=0;i<n;i++)
            {
                if (hm.containsKey(arr[i]))
                {
                    hm.put(arr[i],hm.get(arr[i])+1);
                }
                else {
                    hm.put(arr[i],1);
                }
            }
            int count=0;
            for (int i=0;i<n;i++)
            {
                if (hm.get(arr[i])==k)
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
