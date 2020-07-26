package Hash;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class CountDistinctElementInEveryWindow {

    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(b.readLine());
        while (cases > 0) {
            String[] ss = b.readLine().split(" ");
            int n = Integer.parseInt(ss[0]);
            int k = Integer.parseInt(ss[1]);
            int[] A = new int[n];
            String[] stri = b.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                A[i] = Integer.parseInt(stri[i]);
            }

            HashMap<Integer,Integer> hm= new HashMap<>();
            for (int i=0;i<n-k+1;i++)
            {

                if (i==0)
                {
                    for (int j=i;j<k;j++)
                    {
                        if (hm.containsKey(A[j]))
                        {
                            hm.put(A[j],hm.get(A[j])+1);
                        }
                        else
                        {
                            hm.put(A[j],1);

                        }

                    }
                    System.out.print(hm.size()+" ");

                }
                else
                {
                    int index=i-1;
                    if (hm.get(A[index])>=2)
                    {
                        hm.put(A[index],hm.get(A[index])-1);
                    }
                    else {
                        hm.remove(A[index]);
                    }
                    if (hm.containsKey(A[index+k]))
                    {
                        hm.put(A[index+k],hm.get(A[index+k])+1);
                    }
                    else {
                        hm.put(A[index+k],1);
                    }
                    System.out.print(hm.size()+" ");
                }
            }
            cases--;

        }
    }

}
