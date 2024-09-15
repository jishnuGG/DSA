import java.util.Scanner;

public class Sorting0TO1 {
    public static void sort0to1(int[] arr,int n)
    {
        int temp;
        int left=0;
        int right=n-1;
     
        while(left<right)
        {
          if(arr[left]==0 && arr[right]==1)
          {
            right--;
          }
          else
          {
            temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
          }
        }
        for(int i=0;i<n;i++) System.out.print(arr[i]+" ");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        sort0to1(arr,n);
        sc.close();
    }
}
