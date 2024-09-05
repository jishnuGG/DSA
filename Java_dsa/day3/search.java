import java.util.Arrays;
import java.util.Scanner;

public class search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("enter the target");
        int target=sc.nextInt();
        sc.close();
        binarysearch(arr,0,n,target);
      
    }
    public static void binarysearch(int[] arr,int low,int high,int target)
    {
        int mid=(low+high)/2;
        if(arr[mid]==target){
            System.out.println(arr[mid]+"found in index"+mid);
        }
        else if(target>arr[mid])
        {
            binarysearch(arr, mid+1, high, target);
        }
        else if(target<arr[mid]){
            binarysearch(arr, low, mid-1, target);
        }
        else{
           
        }
    }
}
