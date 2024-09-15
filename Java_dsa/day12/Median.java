import java.util.Arrays;
import java.util.Scanner;

public class Median {
    public static float findmedian(int[] arr,int n)
    {

        Arrays.sort(arr);
        int mid=(n/2);
        if(n%2==0)
        {
            float result = (float)(arr[mid]+arr[mid-1])/2;
            return result;
        }
        else{
            return arr[mid];
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        float result=findmedian(arr,n);
        System.out.println(result);
        sc.close();
    }
}
