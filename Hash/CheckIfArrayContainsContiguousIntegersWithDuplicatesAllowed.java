package Hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class CheckIfArrayContainsContiguousIntegersWithDuplicatesAllowed {

    public static void main(String[] args)  {
        Scanner sc= new Scanner(System.in);
        int cases =sc.nextInt();
        while (cases > 0) {
            int length = sc.nextInt();

            int arr[] = new int[length];
            for (int i = 0; i < length; i++) {
                arr[i] = sc.nextInt();
            }

            TreeSet<Integer> ts= new TreeSet<>();
            for (int i=0;i<length;i++)
            {
                ts.add(arr[i]);
            }
            Iterator<Integer> itr= ts.iterator();
            int x=0;
            int first=0;
            int count=1;
            while (itr.hasNext())
            {
                if (x!=0)
                {
                    int sec=itr.next();
                    if (sec==first+1)
                    {
                        count++;
                        first=sec;

                    }
                    else {
                        break;
                    }

                }
                else
                {
                    first=itr.next();
                    x=1;

                }
            }
            if (count==ts.size())
            {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
            cases--;

        }
    }

}
