package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConvertArrayIntoZig_ZagFashion {
    public static void main(String[] args) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(b.readLine());
        while (cases > 0) {
            int length = Integer.parseInt(b.readLine());
            String s[] = b.readLine().split(" ");
            int arr[] = new int[length];
            for (int i = 0; i < length; i++) {
                arr[i] = Integer.parseInt(s[i]);
            }

            if (length%2==0) {

                for (int i=1;i<length-1;i=i+2)
                {
                    if (arr[i]<arr[i-1])
                    {
                        int  temp=arr[i-1];
                        arr[i-1]=arr[i];
                        arr[i]=temp;
                    }
                    if (arr[i]<arr[i+1])
                    {
                        int  temp=arr[i+1];
                        arr[i+1]=arr[i];
                        arr[i]=temp;
                    }
                }
                if (arr[length-1]<arr[length-2])
                {
                    int temp=arr[length-2];
                    arr[length-2]=arr[length-1];
                    arr[length-1]=temp;
                }

            }
            else {
                for (int i=1;i<length-1;i=i+2)
                {
                    if (arr[i]<arr[i-1])
                    {
                        int  temp=arr[i-1];
                        arr[i-1]=arr[i];
                        arr[i]=temp;
                    }
                    if (arr[i]<arr[i+1])
                    {
                        int  temp=arr[i+1];
                        arr[i+1]=arr[i];
                        arr[i]=temp;
                    }
                }
            }
            for (int x:arr)
            {
                System.out.print(x+" ");
            }
            System.out.println();
            cases--;
        }
    }
}

