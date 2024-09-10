import java.util.Scanner;
import java.util.*;
public class ContainsDuplicates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        List<Integer> duplicates=new ArrayList<>();
       
       // HashSet<Integer> hash=new HashSet<>();
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
     
      /*   for(int i=0;i<n;i++)
        {
            if(hash.contains(arr[i]))
            {
                duplicates.add(arr[i]);
            }
            else{
                hash.add(arr[i]);
            }
        }
        for(int num:duplicates)
        {
            System.out.print(num+" ");
        }
             */

    // ARRAY INDEX VALUE WITH THE RANGE(1,n)
    for(int i=0;i<n;i++)
    {
        int index=Math.abs(arr[i])-1;
        if(arr[index]<0)
        {
            duplicates.add(index+1);
        }
        arr[index]=-arr[index];
    }

    for(int num:duplicates)
    {
        System.out.print(num+" ");
    }
        sc.close();
        
    }
}
