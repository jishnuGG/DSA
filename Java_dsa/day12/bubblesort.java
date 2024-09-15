import java.util.Scanner;

public class bubblesort {
    public static void Bubblesort(int[] arr,int n)
    {
        int temp;
        int swapCount=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                   temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
                   swapCount++;
                }
            }
        }
        
        System.out.println("SwapCount : "+swapCount+"\nFirst Element :"+arr[0]+"\nlast Element : "+arr[n-1]);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Bubblesort(arr,n);
        sc.close();
    }
}
