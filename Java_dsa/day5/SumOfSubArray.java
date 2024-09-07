import java.util.Scanner;

public class SumOfSubArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       int[] arr=new int[n];
       System.out.println("enter the range:");
       int s=sc.nextInt();
       int e=sc.nextInt();
       int sum=0;
       for(int i=0;i<n;i++)
       {
        arr[i]=sc.nextInt();
        if(i>=s && i<=e)
        {
            sum+=arr[i];
        }
       }
       System.out.println(sum);
       sc.close();
    
    }
   
}
