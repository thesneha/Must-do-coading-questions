package Hash;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class CheckIfTwoArraysAreEqualOrNot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        while (cases > 0) {
            int length = sc.nextInt();

            Long arr1[] = new Long[length];
            for (int i = 0; i < length; i++) {
                arr1[i] = sc.nextLong();
            }

            Long arr2[] = new Long[length];
            for (int i = 0; i < length; i++) {
                arr2[i] = sc.nextLong();
            }

            HashMap<Long,Long> hm1= new HashMap<>();
            for (int i=0;i<length;i++)
            {
                if (hm1.containsKey(arr1[i]))
                {
                    hm1.put(arr1[i],hm1.get(arr1[i])+1);
                }
                else
                {
                    hm1.put(arr1[i],1l);

                }
            }


            HashMap<Long,Long> hm2= new HashMap<>();
            for (int i=0;i<length;i++)
            {
                if (hm2.containsKey(arr2[i]))
                {
                    hm2.put(arr2[i],hm1.get(arr2[i])+1);
                }
                else
                {
                    hm2.put(arr2[i],1l);

                }
            }
            int count=0;

            for (Map.Entry<Long,Long> x:hm1.entrySet())
            {
                Long key=x.getKey();
                if (hm2.containsKey(key)&&hm2.get(key)==x.getValue())
                {
                    count++;
                }
                else {
                    break;
                }

            }
            if (count==hm1.size())
            {
                System.out.println("1");
            }
            else {
                System.out.println("0");
            }
            cases--;
        }
    }
}
