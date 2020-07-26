package Hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class ConvertAnArrayToReducedForm {

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
            int arr1[]=arr.clone();
            Arrays.sort(arr1);
            HashMap<Integer,Integer> hm= new HashMap<>();
            for (int i=0;i<length;i++)
            {
                hm.put(arr1[i],i);
            }
            for (int i=0;i<length;i++)
            {
                System.out.print(hm.get(arr[i])+" ");
            }
            System.out.println();
            cases--;
        }
    }

}
