import java.util.Scanner;

public class Odd_Even_Sorting {
    public static void Oddevensort(int[] arr,int n)
    {
        int temp;
        boolean sorted=false;
       while(!sorted)
       {
         sorted=true;
         for(int i=1;i<n-1;i+=2)
         {
            if(arr[i]>arr[i+1])
            {
            temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
            sorted=false;
            }

         }
         for(int j=0;j<n-1;j+=2)
         {
            if(arr[j]>arr[j+1])
            {
            temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
            sorted=false;
            }
         }

       }

        
        for(int i=0;i<n;i++) System.out.print(arr[i]+" ");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Oddevensort(arr,n);
        sc.close();
    }
}
