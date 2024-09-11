import java.util.Scanner;

public class MaxElement_Recursion {
    public static int FindMax(int[] arr,int low,int high)
    {
       if(low==high)
       {
         return arr[low];
       }
       int mid=(low+high)/2;
       int leftmax=FindMax(arr, low, mid);
       int rightmax=FindMax(arr, mid+1, high);
       return Math.max(leftmax, rightmax);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int result=FindMax(arr,0,n-1);
        System.out.println("Maximum element is:"+result);
        sc.close();
    }
}
