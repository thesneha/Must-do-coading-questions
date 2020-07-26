package Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SubArrayWithGivenSum {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(b.readLine());
        while (cases > 0) {
            String[] ss = b.readLine().split(" ");
            int n = Integer.parseInt(ss[0]);
            int s = Integer.parseInt(ss[1]);
            int[] arr = new int[n];
            String[] stri = b.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(stri[i]);
            }
            int[] result=subArraySum(arr ,s);
            if (result[0]==-1)
            {
                System.out.println(-1);
            }
            else
            {
                System.out.println(result[0]+" "+result[1]);
            }
            cases--;


        }

    }

    public  static int[] subArraySum(int[]arr,int s)
    {
        int sum=0;
        int j=0;
        int resultArr[]= new int[2];
        resultArr[0]=-1;
        resultArr[1]=-1;
        for (int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
            while (sum>s) {
                if (sum > s) {
                    sum = sum - arr[j];
                    j++;
                }
            }
            if (sum==s)
            {
                resultArr[0]=j+1;
                resultArr[1]=i+1;
                return resultArr;

            }
        }
        return resultArr;
    }

}
