package Hash;


import java.util.*;
import java.io.*;
import java.lang.*;
import java.util.Map.Entry;


class Driverclass1
{
    public static void main(String[] args) throws NumberFormatException, IOException
    {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(sc.readLine());
        while(n != 0)
        {
            int size = Integer.parseInt(sc.readLine());
            int arr[] = new int[size];
            String[] temp = sc.readLine().trim().split("\\s+");

            for(int i = 0; i < size; i++)
                arr[i] = Integer.parseInt(temp[i]);

            new Sorting().sortByFreq(arr, size);
            System.out.println();
            n--;
        }
    }
}

class Sorting
{
    static void sortByFreq(int arr[], int n)
    {
        Map<Integer,Integer> tm= new HashMap<>();
        for (int i=0;i<n;i++)
        {
            if (tm.containsKey(arr[i]))
            {
                tm.put(arr[i],tm.get(arr[i])+1);
            }
            else
            {
                tm.put(arr[i],1);

            }
        }


        List<Map.Entry<Integer, Integer> > list =
                new LinkedList<Map.Entry<Integer, Integer> >(tm.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() {
            public int compare(Map.Entry<Integer, Integer> o1,
                               Map.Entry<Integer, Integer> o2)
            {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });

        int j=0;
        for (int i=0;i<list.size();i++)
        {
          int val=list.get(i).getValue();
          while (val>0)
          {
              arr[j]=list.get(i).getKey();
              j++;
              val--;
          }
        }
        for (int x:arr)
        {
            System.out.print(x+" ");
        }


    }
}