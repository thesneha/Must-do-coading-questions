package Hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CheckIfFrequenciesCanBeEqual {
    public static void main(String[]args) throws IOException
    {
        BufferedReader b= new BufferedReader(new InputStreamReader(System.in));
        int cases=Integer.parseInt(b.readLine());
        while (cases>0)
        {
            String s=b.readLine();
            HashMap<Character,Integer> hm= new HashMap<>();
            for (int i=0;i<s.length();i++)
            {
                if (hm.containsKey(s.charAt(i)))
                {
                    hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
                }
                else {
                    hm.put(s.charAt(i),1);
                }
            }

            int max=Integer.MIN_VALUE;
            char key='a';
            for (Map.Entry<Character,Integer> e:hm.entrySet())
            {
                if (e.getValue()>max)
                {
                    max=e.getValue();
                    key=e.getKey();
                }

            }
            hm.remove(key);
            int count=0;
            for (Map.Entry<Character,Integer> e:hm.entrySet())
            {
                if (max==1)
                {
                    if (max==e.getValue())
                    {
                        count++;
                    }
                }
                else
                {
                    if (max - e.getValue() == 1)
                    {
                        count++;
                    }
                }
            }
            if (count==hm.size())
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
