import java.util.Scanner;

public class Maxprofit {
    public static int findmaxprofit(int[] arr,int n)
    {
        int minprofit=arr[0];
        int Maxprofit=0;
        int p=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<minprofit)
            {
                minprofit=arr[i];
            }
            else{
                 p=arr[i]-minprofit;

            }
            if(p>Maxprofit)
            {
                Maxprofit=p;
            }
        }
        return Maxprofit;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the prices:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int profit=findmaxprofit(arr,n);
        sc.close();
        System.err.println("profit:"+profit);
    }
}