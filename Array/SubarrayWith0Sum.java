package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class SubarrayWith0Sum {

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


            Set<Integer> set= new HashSet<>();
            int currentSum=0;
            int count=0;
            for (int i=0;i<length;i++)
            {
                currentSum=currentSum+arr[i];
                if (currentSum==0||set.contains(currentSum))
                {
                    System.out.println("Yes");
                    count++;
                    break;
                }
                set.add(currentSum);

            }
            if (count==0)
            {
                System.out.println("No");

            }
            cases--;
        }
    }

}
