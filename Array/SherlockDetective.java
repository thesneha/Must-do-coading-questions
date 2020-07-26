package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class SherlockDetective {

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
            HashMap<Integer,Integer> h= new HashMap<>();
            for (int i=0;i<length;i++)
            {
                if (h.containsKey(arr[i]))
                {
                    h.put(arr[i],h.get(arr[i])+1);
                }
                else {
                    h.put(arr[i],1);
                }
            }
            for (int i=1;i<=length;i++)
            {
                if (!h.containsKey(i))
                {
                    System.out.print(i+" ");
                }

            }
            System.out.println();
            cases--;
        }
    }

}
