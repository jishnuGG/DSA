import java.util.Scanner;

public class ArrayOperation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int sum=0;
        int product=1;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            sum+=arr[i];
            product*=arr[i];
        }
        System.out.println("sum:"+sum+" Product:"+product+" Average:"+sum/n);
        sc.close();
    }
}
