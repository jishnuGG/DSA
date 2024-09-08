import java.util.*;
public class Twopointer {
    public static boolean findtarget(int[] arr,int n,int target)
    {
        int left=0;
        int right=n-1;
        int sum=0;
        while(left<right)
        {
            sum=arr[left]+arr[right];
            if(sum==target)
            {
                return true;         
           }
           else if(sum<target)
           left++;
           else
           right--;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the target element:");
    int k=sc.nextInt();
       boolean isIn=findtarget(arr,n,k);
      System.out.println(isIn);
      sc.close();
    }
}
