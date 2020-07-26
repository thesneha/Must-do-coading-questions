package Searching;


import java.util.Scanner;
class Duplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            GfG g = new GfG();
            g.printDuplicates(a, n);
            System.out.println();
        }
    }
}


class GfG {
    public static void printDuplicates(int arr[], int n) {

        int count=0;
        for (int i=0;i<n;i++)
        {
            int index=arr[i]%n;
            arr[index]=arr[index]+n;
        }
        for (int i=0;i<n;i++)
        {
            if (arr[i]>=n*2)
            {
                System.out.print(i+" ");
                count++;
            }
        }
        if (count==0)
        {
            System.out.println("-1");
        }


    }
}




