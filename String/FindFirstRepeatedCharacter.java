package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class FindFirstRepeatedCharacter {
    public static void main(String[] args) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(b.readLine());
        while (cases>0)
        {
            String s= b.readLine();
            int count=0;
            char c='a';
            HashMap<Character,Integer> hm= new HashMap<>();
            for (int i=0;i<s.length();i++)
            {
                if (hm.containsKey(s.charAt(i)))
                {
                    c=s.charAt(i);
                    count++;
                    break;
                }
                else
                {
                    hm.put(s.charAt(i),1);
                }
            }
            if (count==0)
            {
                System.out.println("-1");
            }
            else {
                System.out.println(c);
            }
            cases--;
        }
    }
}

