package Array;

import java.util.Scanner;

public class NextGreater {
    public  static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        num=num+1;
        while (isReapeted(num))
        {
            num=num+1;
        }
        System.out.println(num);
    }




     public static Boolean isReapeted(int num)
     {
         int arr[]= new int[10];
         int x=0;
         while(num>0)
         {
             x=num%10;
             arr[x]++;
             num/=10;
         }
         for (int i=0;i<arr.length;i++)
         {
             if (arr[i]>1)
             {
                 return true;
             }

         }
         return false;

     }

}
