package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfix {
    public  static  void main(String[] arga) throws IOException
    {
        BufferedReader b= new BufferedReader( new InputStreamReader(System.in));
        int cases=Integer.parseInt(b.readLine());
        while (cases>0)
        {

            String s= b.readLine();
            String result="";
            Stack<Character> stack= new Stack<>();
            for (int i=0;i<s.length();i++)
            {
                if (Character.isLetterOrDigit(s.charAt(i)))
                {
                    result=result+s.charAt(i);

                }
                else if (s.charAt(i)=='(')
                {
                    stack.push(s.charAt(i));
                }
                else if (s.charAt(i)==')')
                {
                    while (!stack.isEmpty()&&stack.peek()!='(')
                    {
                        result=result+stack.pop();
                    }
                    stack.pop();
                }
                else
                {
                    while (!stack.isEmpty()&&precedence(s.charAt(i))<=precedence(stack.peek()))
                    {
                        result=result+stack.pop();

                    }
                    stack.push(s.charAt(i));
                }

            }
            while (!stack.isEmpty())
            {
                result=result+stack.pop();
            }
            System.out.println(result);
            cases--;
        }

    }

    public static int precedence(Character c)
    {
        switch (c)
        {
            case '^':
            return 3;

            case '+':
            case '-':
            return 1;

            case '*':
            case '/':
            return 2;
        }

        return -1;
    }

}
