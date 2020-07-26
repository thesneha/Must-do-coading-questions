package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Inverter {

    public  static  void main(String[]args)throws IOException
    {
        BufferedReader b= new BufferedReader( new InputStreamReader(System.in));
        int noOfAc= Integer.parseInt(b.readLine());
        String arr[]= new String[noOfAc];
        String s1="Inverter";
        String s2="Non-Inverter";
        int countInverter=0;
        int countNonInverter=0;
       String []s= b.readLine().split(" ");
        for (int i=0;i<noOfAc;i++)
        {
            arr[i]=s[i];
        }

        int count=0;
        for (int i=0;i<noOfAc;i++)
        {
            if (arr[i].equalsIgnoreCase(s1))
            {
                countInverter++;
            }

            if (arr[i].equalsIgnoreCase(s1))
            {
                countNonInverter++;
            }
            if (!arr[i].equalsIgnoreCase(s1)&&!arr[i].equalsIgnoreCase(s2))
            {
                System.out.println(arr[i]+" AC is not available");
                count++;
                break;
            }





        }

        if (count==0) {
            System.out.println("Inverter AC is of count" + countInverter);
            System.out.println("Non-Inverter AC is of count" + countNonInverter);
        }
    }
}
