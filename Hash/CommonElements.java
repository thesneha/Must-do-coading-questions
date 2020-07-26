package Hash;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class CommonElements {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(b.readLine());
        while (cases > 0) {
            String[] ss = b.readLine().split(" ");
            int n1 = Integer.parseInt(ss[0]);
            int n2 = Integer.parseInt(ss[1]);
            int n3 = Integer.parseInt(ss[2]);


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

            int[] arr3 = new int[n3];
            String[] stri3 = b.readLine().split(" ");
            for (int i = 0; i < n3; i++) {
                arr3[i] = Integer.parseInt(stri3[i]);
            }

            HashMap<Integer,Integer> hm2= new HashMap<>();
            for (int i=0;i<n2;i++)
            {
                if (hm2.containsKey(arr2[i]))
                {
                    hm2.put(arr2[i],hm2.get(arr2[i])+1);
                }
                else
                {
                    hm2.put(arr2[i],1);

                }
            }

            HashMap<Integer,Integer> hm3= new HashMap<>();
            for (int i=0;i<n3;i++)
            {
                if (hm3.containsKey(arr3[i]))
                {
                    hm3.put(arr3[i],hm3.get(arr3[i])+1);
                }
                else
                {
                    hm3.put(arr3[i],1);

                }
            }
            int count=0;
            for (int i=0;i<n1;i++)
            {
                if (hm2.containsKey(arr1[i])&&hm3.containsKey(arr1[i]))
                {
                    System.out.print(arr1[i]+" ");
                    hm2.remove(arr1[i]);
                    hm3.remove(arr1[i]);
                    count++;
                }
            }
            if (count==0)
            {
                System.out.println("-1");
            }
            System.out.println();
            cases--;
        }
    }
}
