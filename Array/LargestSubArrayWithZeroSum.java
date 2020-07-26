package Array;
import java.util.*;

class MaxLenZeroSumSub {

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

            GfG1 g = new GfG1();
            System.out.println(g.maxLen(arr, n));
            T--;
        }
    }
}


class GfG1 {
    int maxLen(int arr[], int n) {
        HashMap<Integer,Integer> hm= new HashMap<>();
        int maxLength=0;
        int currentSum=0;
        for (int i=0;i<n;i++)
        {
            currentSum=currentSum+arr[i];
            if (arr[i]==0&&maxLength==0)
            {
                maxLength=1;
            }
            if (currentSum==0)
            {
                maxLength=i+1;
            }
            if (hm.containsKey(currentSum))
            {
                maxLength=Integer.max(maxLength,i-hm.get(currentSum));
            }
            else {
                hm.put(currentSum,i);
            }

        }
        return maxLength;

    }
}