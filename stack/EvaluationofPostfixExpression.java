package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class EvaluationofPostfixExpression {
    public  static  void  main(String[]args) throws IOException
    {
        BufferedReader b= new BufferedReader(new InputStreamReader(System.in));
        int cases=Integer.parseInt( b.readLine());
        while (cases>0)
        {

            String s= b.readLine();
            Stack<Integer> st= new Stack<>();
            int result=0;
            for (int i=0;i<s.length();i++)
            {
                if (Character.isDigit(s.charAt(i)))
                {
                    st.push(Character.getNumericValue(s.charAt(i)));
                }
                else
                {
                    int op1=st.pop();
                    int op2=st.pop();
                    result=evaluate(op1,op2,s.charAt(i));

                    st.push(result);

                }
            }
            System.out.println(st.pop());
            cases--;
        }
    }
    public static int evaluate(int b,int a,char c)
    {
        switch (c)
        {
            case '+':
            return a+b;

            case '-':
                return a-b;

            case '*':
                return a*b;

            case '/':
                return a/b;
        }
        return 0;
    }

}
