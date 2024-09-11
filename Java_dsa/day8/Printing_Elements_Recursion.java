import java.util.*;
public class Printing_Elements_Recursion {
    public static void print(int[] arr,int low,int high)
    {
         if(low>high)
         {
            return;
         }
         System.out.println(arr[low]);
         print(arr, low+1, high);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        print(arr,0,n-1);
          sc.close();
    }
}
