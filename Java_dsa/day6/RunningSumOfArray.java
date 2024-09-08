import java.util.Scanner;

public class RunningSumOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
            arr[i]=sum;
        }
        for(int num=0;num<n;num++)
        {
            System.out.print(arr[num]+" ");
        }
        sc.close(); 
    }
}
