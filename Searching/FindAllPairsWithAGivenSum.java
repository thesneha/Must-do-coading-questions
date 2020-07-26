package Searching;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class FindAllPairsWithAGivenSum {


    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(b.readLine());
        while (cases > 0) {
            String[] ss = b.readLine().split(" ");
            int n = Integer.parseInt(ss[0]);
            int m = Integer.parseInt(ss[1]);
            int x = Integer.parseInt(ss[2]);

            int[] arr1 = new int[n];
            String[] stri1 = b.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr1[i] = Integer.parseInt(stri1[i]);
            }

            int[] arr2 = new int[m];
            String[] stri2 = b.readLine().split(" ");
            for (int i = 0; i < m; i++) {
                arr2[i] = Integer.parseInt(stri2[i]);
            }
            Arrays.sort(arr1);


            HashMap<Integer,Integer> hm= new HashMap<>();
            StringBuffer  sb= new StringBuffer();
            int count=0;
            for (int i=0;i<m;i++)
            {
                hm.put(arr2[i],1);
            }
            for (int i=0;i<n;i++)
            {
                int val=x-arr1[i];
                if (hm.containsKey(val))
                {
                    sb.append(arr1[i]+" "+val+", ");
                    count++;


                }
            }
            if (count==0)
            {
                System.out.println("-1");
            }
            else {
                sb.delete(sb.length() - 2, sb.length() - 1);
                System.out.println(sb);
            }
            cases--;
        }
    }

}
