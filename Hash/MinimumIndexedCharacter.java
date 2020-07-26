package Hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class MinimumIndexedCharacter {

    public static void main(String[] args) throws IOException {
        BufferedReader b= new BufferedReader(new InputStreamReader(System.in));
        int cases= Integer.parseInt(b.readLine());
        while (cases>0)
        {
            String s1= b.readLine();
            String s2=b.readLine();
            HashMap<Character,Integer> hm= new HashMap<>();
            for (int i=0;i<s1.length();i++)
            {
                if (hm.containsKey(s1.charAt(i)))
                {
                    hm.put(s1.charAt(i),hm.get(s1.charAt(i)));

                }
                else
                {
                    hm.put(s1.charAt(i),i);

                }
            }
            int minChar=Integer.MAX_VALUE;
            char c='a';
            for (int i=0;i<s2.length();i++)
            {
                if (hm.containsKey(s2.charAt(i)))
                {
                    if (hm.get(s2.charAt(i))<minChar)
                    {
                        minChar=hm.get(s2.charAt(i));
                        c=s2.charAt(i);
                    }
                }
            }
            if (minChar==Integer.MAX_VALUE)
            {
                System.out.println("$");
            }
            else {
                System.out.println(c);

            }
            cases--;
        }
    }
}
