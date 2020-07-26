package Hash;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class RelativeSorting {

    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(b.readLine());
        while (cases > 0) {
            String[] ss = b.readLine().split(" ");
            int n1 = Integer.parseInt(ss[0]);
            int n2 = Integer.parseInt(ss[1]);


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

            Map<Integer,Integer> hm= new TreeMap<>() ;
            for (int i=0;i<n1;i++)
            {
                if (hm.containsKey(arr1[i]))
                {
                    hm.put(arr1[i],hm.get(arr1[i])+1);
                }
                else
                {
                    hm.put(arr1[i],1);

                }
            }

            int j=0;
            for (int i=0;i<n2;i++)
            {
                if (hm.containsKey(arr2[i]))
                {
                    int count=hm.get(arr2[i]);
                    while (count>0)
                    {
                        arr1[j]=arr2[i];
                        j++;
                        count--;
                    }
                }
                hm.remove(arr2[i]);
            }
            for (Map.Entry<Integer,Integer> e:hm.entrySet())
            {
                int key=e.getKey();
                int val=e.getValue();
                while (val>0)
                {
                    arr1[j]=key;
                    j++;
                    val--;
                }
            }

            for (int x:arr1)
            {
                System.out.print(x+" ");
            }
            System.out.println();

            cases--;
        }
    }

}
