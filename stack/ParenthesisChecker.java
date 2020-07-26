package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class ParenthesisChecker {

    public  static  void main(String[]args) throws IOException
    {
        BufferedReader b= new BufferedReader(new InputStreamReader(System.in));
        int cases=Integer.parseInt(b.readLine());
        while (cases>0)
        {

            String s=b.readLine();
            int count=0;
            Stack <Character>st= new Stack();
            for (int i=0;i<s.length();i++)
            {
                if (s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='[')
                {
                    st.push(s.charAt(i));
                }

                if (s.charAt(i)==')')
                {
                    if (!st.isEmpty()) {
                        Character c = st.peek();

                        if (c=='(')
                        {
                            count++;
                            st.pop();
                            continue;
                        }
                        else System.out.println("not balanced");
                        st.clear();
                        break;
                    }
                    else System.out.println("not balanced");
                    st.clear();
                    break;

                }
                if (s.charAt(i)=='}')
                {
                    if (!st.isEmpty()) {
                        Character c = st.peek();

                        if (c=='{')
                        {
                            count++;
                            st.pop();
                            continue;
                        }
                        else System.out.println("not balanced");
                        st.clear();
                        break;
                    }
                    else System.out.println("not balanced");
                    st.clear();
                    break;


                }
                if (s.charAt(i)==']')
                {
                    if (!st.isEmpty()) {
                        Character c = st.peek();

                        if (c=='[')
                        {
                            count++;
                            st.pop();
                            continue;
                        }
                        else System.out.println("not balanced");
                        st.clear();
                        break;
                    }
                    else System.out.println("not balanced");
                    st.clear();
                    break;

                }


            }
            if (!st.isEmpty())
            {
                System.out.println("not balanced");
            }

            if (count*2==s.length())
            {
                System.out.println("balanced");
            }
            cases--;

        }
    }
}
