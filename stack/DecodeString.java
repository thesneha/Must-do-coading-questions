package stack;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

    class DecodeTheString {
    public static  void main(String[]args) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int cases=Integer.parseInt(b.readLine());
        while (cases>0)
        {
            String s= b.readLine();
            String result=DecodeString(s);
            System.out.println(result);
            cases--;

        }
    }
    public  static  String DecodeString(String  s)
    {
        Stack<Character> charstack= new Stack<>();
        Stack<Integer> intstack= new Stack<>();
        String res="";
        String  temp="";
        for (int i=0;i<s.length();i++)
        {
            if (Character.isDigit(s.charAt(i)))
            {
                int count=0;
                while (Character.isDigit(s.charAt(i))) {
                    count=count*10+ Character.getNumericValue(s.charAt(i));
                    i++;
                }
                i--;
                intstack.push(count);
            }
            else if (s.charAt(i)=='[')
            {
                charstack.push(s.charAt(i));

            }
            else if (s.charAt(i)==']') {
                int count = 0;
                if (!intstack.isEmpty()) {
                    count = intstack.pop();
                }
                while (charstack.peek() != '['&&!charstack.isEmpty()) {
                    res = charstack.pop()+res;

                }
                if (charstack.peek()=='[')
                {
                    charstack.pop();
                }
                for (int j=0;j<count;j++)
                {
                    temp=temp+res;
                }
                for (int k=0;k<temp.length();k++)
                {
                    charstack.push(temp.charAt(k));
                }
                temp="";
                res="";


            }
            else
            {
                charstack.push(s.charAt(i));
            }

        }
        while (!charstack.isEmpty())
        {
            res= charstack.pop()+res;
        }
        return  res;
    }

}