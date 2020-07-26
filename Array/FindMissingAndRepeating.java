package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class FindMissingAndRepeating {

    public  static  void  main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int cases= sc.nextInt();
        while (cases>0)
        {
            int length = sc.nextInt();
            int arr[]= new int[length];
            for (int i=0; i<length;i++)
            {
                arr[i]= sc.nextInt();
            }
            Arrays.sort(arr);
            int missing;
            int repeating=0;
            int repeatingSum=0;
            int sum=0;
            for (int i=1;i<=length;i++)
            {
                sum=sum+i;
            }

            for (int i=0;i<length-1;i++)
            {
                if (arr[i]==arr[i+1])
                {
                    repeating=arr[i];

                }
                repeatingSum=repeatingSum+arr[i];
            }
            repeatingSum=repeatingSum+arr[length-1];
            missing=sum-(repeatingSum-repeating);
            System.out.println(repeating+" "+ missing);
                    cases--;
        }
    }

}
