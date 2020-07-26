package Matrix;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SpirallyTraversingAMatrix {

    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        int cases=sc.nextInt();
        while (cases>0)
        {
            int arr1[]=new int[2];
            for (int i=0;i<2;i++)
            {
                arr1[i]=sc.nextInt();
            }
            int arr[][]=new int[arr1[0]][arr1[1]];
            for (int i = 0; i < arr1[0]; i++) {
                for (int j=0;j<arr1[1];j++) {
                    arr[i][j] = sc.nextInt();
                }
            }


            int top=0;
            int bottom=arr1[0]-1;
            int left=0;
            int right=arr1[1]-1;
            int dir=0;
            while (top<=bottom&&left<=right)
            {
                if (dir==0) {
                    for (int i = left; i <= right; i++) {
                        System.out.print(arr[top][i] + " ");
                        dir=1;


                    }
                    top++;
                }
                if (dir==1) {
                    for (int i = top; i <= bottom; i++) {
                        System.out.print(arr[i][right] + " ");
                        dir=2;

                    }
                    right--;

                }
                if (dir==2) {
                    for (int i = right; i >= left; i--) {
                        System.out.print(arr[bottom][i] + " ");
                        dir=3;

                    }
                    bottom--;

                }
                if (dir==3) {
                    for (int i = bottom; i >= top; i--) {
                        System.out.print(arr[i][left] + " ");
                        dir=0;

                    }
                    left++;

                }

            }
            System.out.println();
            cases--;

        }
    }
}

