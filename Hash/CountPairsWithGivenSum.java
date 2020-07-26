package Hash;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountPairsWithGivenSum {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        while (cases > 0) {
            int n=sc.nextInt();
            int[] arr1 = new int[n];
            for (int i = 0; i < n; i++) {
                arr1[i] = sc.nextInt();
            }
            int x=sc.nextInt();
            HashMap<Integer,Integer> hm= new HashMap<>();

            int count=0;
            for (int i=0;i<n;i++)
            {
              if (hm.containsKey(arr1[i]))
              {
                  hm.put(arr1[i],hm.get(arr1[i])+1);
              }
              else {
                  hm.put(arr1[i],1);
              }
            }

            for (int i=0;i<n;i++) {
                if (x == 0) {
                    if (hm.containsKey(arr1[i])&&hm.get(arr1[i])>=2)
                    {
                        count++;
                        hm.remove(arr1[i]);
                    }

                }
                else {
                    int val = x + arr1[i];
                    if (hm.containsKey(val)) {
                        count++;
                        if (hm.get(val)>=2) {
                            hm.remove(val);
                        }
//                        if (hm.containsKey(arr1[i])&&hm.get(arr1[i])>=2)
//                        {
//                            hm.remove(arr1[i]);
//                        }

                    }
                }
            }


            System.out.println(count);
            cases--;
        }
    }

}
