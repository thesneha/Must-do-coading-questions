package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ElementWithLeftSideSmallerAndRightSideGreater {

    public static void main(String[] args) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(b.readLine());
        while (cases > 0) {
            int length = Integer.parseInt(b.readLine());
            String temp=b.readLine().trim().replaceAll(" +"," ");
            String s[] =temp.split(" ");
            int arr[] = new int[length];
            for (int i = 0; i < length; i++) {
                arr[i] = Integer.parseInt(s[i]);
            }
            int max=arr[0];
            int count=0;
            for (int i=1;i<length;i++)
            {
                if (arr[i]>max)
                {
                    max=arr[i];
                    Boolean result=allGreater(arr[i],arr,i);
                    if (result==true&&i!=length-1&&i!=0)
                    {
                        System.out.println(arr[i]);
                        count++;
                        break;
                    }
                }
            }
            if (count==0)
            {
                System.out.println("-1");

            }
            cases--;
        }
    }

    public  static Boolean allGreater(int value,int arr[], int index)
    {
        int min=value;
        for (int i=index+1;i<arr.length;i++)
        {
            if (arr[i]>=min)
            {
                continue;
            }
            else return false;
        }
        return true;
    }


}
