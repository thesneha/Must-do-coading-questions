package Array;



class GFG {

    // Function to reverse every sub-array formed by
    // consecutive k elements
    static void reverse(int arr[], int n, int k)
    {
        for (int i = 0; i < n; i += k/2)
        {
            int left = i;

            // to handle case when k is not multiple
            // of n
            int right = Math.min(i + k - 1, n - 1);
            int temp;

            // reverse the sub-array [left, right]
            while (left < right)
            {
                temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left+=1;
                right-=1;
            }

             k=k*2;
        }
    }

    // Driver method
    public static void main(String[] args)
    {

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int k = 1;

        int n = arr.length;

        reverse(arr, n, k);

        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
