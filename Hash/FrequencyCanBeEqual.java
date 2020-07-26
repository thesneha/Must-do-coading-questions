package Hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class FrequencyCanBeEqual {

    public static void main(String[]args) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(b.readLine());
        while (cases > 0) {
            String s = b.readLine();
            HashMap<Character, Integer> hm = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                if (hm.containsKey(s.charAt(i))) {
                    hm.put(s.charAt(i), hm.get(s.charAt(i)) + 1);
                } else {
                    hm.put(s.charAt(i), 1);
                }
            }

            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            char keyMax='a';
            char keyMin='a';
            int countMax=1;
            int countMin=1;
            for (Map.Entry<Character,Integer> e:hm.entrySet())
            {
                if (e.getValue()>=max)
                {
                    if (e.getValue()==max) {
                        countMax++;
                    }
                    max=e.getValue();
                    keyMax=e.getKey();
                }
                if (e.getValue()<=min)
                {
                    if (e.getValue()==min) {
                        countMin++;
                    }
                    min=e.getValue();
                    keyMin=e.getKey();
                }

            }
            System.out.println(max+" "+min);
            cases--;

        }
    }

}
