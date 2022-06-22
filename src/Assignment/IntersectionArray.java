package Assignment;
import java.util.*;
public class IntersectionArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        int n=sc.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        for(int i=0;i<arr1.length;i++)
        {
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<arr2.length;i++)
        {
            arr2[i]=sc.nextInt();
        }
        intersectArrays(arr1,arr2,list);
        System.out.println(list);

    }
    public static void intersectArrays(int[] arr1,int[] arr2,List<Integer> list)
    {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i=0;
        int j=0;
        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i]<arr2[j])
            {
                i++;
            }
            else if(arr1[i]>arr2[j])
            {
                j++;
            }
            else{
                list.add(arr1[i]);
                System.out.println(list);
                i++;j++;
            }
        }

    }
}
