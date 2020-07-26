package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class Removerepeateddigitsinagivennumber {

    public  static  void  main(String[]args) throws IOException
    {
        BufferedReader b= new BufferedReader(new InputStreamReader(System.in));
        int cases=Integer.parseInt(b.readLine());
        while (cases>0)
        {

            String num=b.readLine();
            Stack<Long> s= new Stack<>();
            Long l=Long.parseLong(num);
            while (l>0)
            {
                long remi= l%10;
                l=l/10;
                if (!s.isEmpty())
                {
                    if (s.peek()==remi)
                    {
                        continue;
                    }
                    else {
                        s.push(remi);
                    }
                }
                else {
                    s.push(remi);
                }

            }
            Stack<Long> ss= new Stack<>();
            while (!s.isEmpty())
            {
                ss.push(s.pop());
            }
            Long re=0L;
            Long x=1L;
            while (!ss.isEmpty())
            {
                re=re+ss.pop()*x;
                x=x*10;

            }
            System.out.println(re);
           cases--;
        }
    }

}
