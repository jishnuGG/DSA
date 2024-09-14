import java.util.*;
public class BinarySearch {
    public static int binarysearch(int[] arr,int low,int high,int target)
    {
        int mid=(low+high)/2;
        if(arr[mid]==target)
        {
         return mid;
        }
        else if(arr[mid]>target)
        {
            return binarysearch(arr, low, mid-1, target);
        }
        else if(arr[mid]<target){
            return binarysearch(arr, mid+1, high, target);
        }
        else{return -1;}
       
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int target=sc.nextInt();
        int result=binarysearch(arr, 0,n-1,target);
        if(result>=0) System.out.println("found at : "+result);
        else {System.out.println("not found");}
        sc.close();
    }
}
