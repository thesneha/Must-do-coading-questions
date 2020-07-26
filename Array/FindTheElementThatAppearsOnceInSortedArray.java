package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public class FindTheElementThatAppearsOnceInSortedArray {

    public static void main(String[] args) throws IOException {
        Scanner sc= new Scanner(System.in);
        int cases = sc.nextInt();
        while (cases > 0) {
            int length = sc.nextInt();
            int arr[] = new int[length];
            for (int i = 0; i < length; i++) {
                arr[i] = sc.nextInt();
            }
            HashMap<Integer,Integer> hm= new HashMap<>();
            for (int i=0;i<length;i++)
            {
                if (hm.containsKey(arr[i]))
                {
                    hm.put(arr[i],hm.get(arr[i])+1);
                }
                else
                {
                    hm.put(arr[i],1);
                }
            }
            for (int i=0;i<length;i=i+2)
            {
                if (hm.get(arr[i])!=2)
                {
                    System.out.println(arr[i]);
                    break;
                }
            }
            cases--;
        }
    }

}
