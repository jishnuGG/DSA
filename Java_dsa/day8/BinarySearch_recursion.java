import java.util.Scanner;

public class BinarySearch_recursion {
    public static int BinarySearch(int[] arr,int low,int high,int k)
    {
        if(low>high)
        {
            return -1;
        }
        int mid=(low+high)/2;
        if(arr[mid]==k)
        {
            return mid;
        }
        if(k>arr[mid])
        {
            return BinarySearch(arr,mid+1,high, k);
        }
            return BinarySearch(arr, low, mid-1, k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        System.out.println("enter the target:");
        int k=sc.nextInt();
        System.out.println("searching....");
        int result=BinarySearch(arr,0,n-1,k);
        if(result>=0) System.out.println("value found at:"+result);
        else{System.out.println("not found");}
        sc.close();
    }
}