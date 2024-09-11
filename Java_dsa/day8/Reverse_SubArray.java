import java.util.Scanner;

public class Reverse_SubArray {
    public static void reverse(int[] arr,int l,int r)
    {
        if(l>=r){
            return;
        }
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
        reverse(arr, l+1, r-1);
      
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("enter the array");
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        System.out.println("starting Range:");
        int n1=sc.nextInt();
        System.out.println("Ending Range:");
        int n2=sc.nextInt();
        reverse(arr, n1, n2);
       for(int i=0;i<n;i++)
       {
        System.out.print(arr[i]+" ");
       }
       sc.close();
    }
}
