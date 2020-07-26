package Hash;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;

public class ArraySubsetOfAnotherArray {

    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(b.readLine());
        while (cases > 0) {
            String[] ss = b.readLine().split(" ");
            int n1 = Integer.parseInt(ss[0]);
            int n2= Integer.parseInt(ss[1]);
            int[] arr1 = new int[n1];
            String[] stri1 = b.readLine().split(" ");
            for (int i = 0; i < n1; i++) {
                arr1[i] = Integer.parseInt(stri1[i]);
            }

            int[] arr2 = new int[n2];
            String[] stri2 = b.readLine().split(" ");
            for (int i = 0; i < n2; i++) {
                arr2[i] = Integer.parseInt(stri2[i]);
            }
            HashMap<Integer,Integer> hm= new HashMap<>();
            int count=0;
            for (int i=0;i<n1;i++)
            {
                hm.put(arr1[i],1);
            }
            for (int i=0;i<n2;i++)
            {
                if (hm.containsKey(arr2[i]))
                {
                    count++;
                }
            }
            if (count==n2)
            {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");

            }
            cases--;
        }
    }
}
