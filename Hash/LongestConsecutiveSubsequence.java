package Hash;

import java.util.Scanner;
import java.util.*;
import java.util.HashSet;

class Driverclass
{
    // Driver Code
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t>0)
        {
            int n = sc.nextInt();
            int a[] = new int[n];

            for(int i=0; i<n; i++)
                a[i] = sc.nextInt();

            // Making object of GfG
            Subseq g = new Subseq();

            System.out.println(g.findLongestConseqSubseq(a, n));

            t--;
        }
    }
}
class Subseq
{

    static int findLongestConseqSubseq(int arr[], int n) {
        TreeSet<Integer> hs = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            hs.add(arr[i]);
        }
        int count=1;
        int x=0;
        int first=0;
        int max=1;
        Iterator<Integer> itr= hs.iterator();
        while (itr.hasNext())
        {
            if (x!=0)
            {
                int sec=itr.next();
                if (sec==first+1)
                {
                    count++;
                    if (count>max)
                    {
                        max=count;
                    }

                }
                else {
                    count=1;
                }
                first=sec;


            }
            else {
                 first=itr.next();
                x=1;
            }
        }
        return max;
    }

}
