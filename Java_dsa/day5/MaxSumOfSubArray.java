import java.util.*;
public class MaxSumOfSubArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        //int sum=0;
        int max=arr[0];
        for(int i=0;i<n;i++)
        {
            int sum=0;
           for(int j=0;j<=i;j++)
           {
             sum=sum + arr[j];
             System.out.print(arr[j]+" ");
           }
           System.out.println("Current sum :"+sum);
           if(sum>max)
           {
            max=sum;
           }
           System.out.println(" Max is:"+max);
        }
        System.out.println("Maximum:"+max);
        sc.close();
    }
}
