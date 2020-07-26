package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LastIndexOfOne {
    public static void main(String[] args) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(b.readLine());
        while (cases > 0) {

            String s= b.readLine();
            int index=0;
            int count=0;
            for (int i=0;i<s.length();i++)
            {
                if (Character.getNumericValue(s.charAt(i))==1)
                {
                    index=i;
                    count++;
                }
            }
            if (count == 0)
            {
                System.out.println("-1");

            }
            else
            {
                System.out.println(index);
            }
            cases--;

        }

    }
}
