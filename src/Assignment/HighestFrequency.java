package Assignment;

import java.security.KeyStore;
import java.util.*;

public class HighestFrequency
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> hp=new HashMap<>();
        highest(arr,hp,list);

    }
    public static void highest(int[] arr, HashMap<Integer,Integer> hp, List<Integer> list)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(!hp.containsKey(arr[i]))
            {
                count=1;
                hp.put(arr[i],count);
            }
            else
            {
                count=count+1;
                hp.put(arr[i],count);
            }
        }

        for(Integer key:hp.keySet())
        {
            System.out.println(key+" "+hp.get(key));
            list.add(hp.get(key));
        }
        Collections.sort(list);
        System.out.println(list);
        System.out.println(list.get(list.size()-1));
        int a=list.get(list.size()-1);
        for(Map.Entry<Integer,Integer> entry:hp.entrySet())
        {
            if(entry.getValue()==a)
            {
                System.out.println(entry.getKey());
            }
        }

    }


}
