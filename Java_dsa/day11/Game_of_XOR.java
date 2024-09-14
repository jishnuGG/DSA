import java.util.Scanner;

public class Game_of_XOR {
    public static int gameofXOR(int[] arr,int n)
    {
        int totalxor=0;int xor=0;
        for(int i=0;i<n;i++)
        {
           for(int j=i;j<n;j++)
           {
            xor=0;
            for(int k=i;k<=j;k++)
            {
                xor^=arr[k];
            }
           }
           totalxor^=xor;
        }
        return totalxor;
       
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int result=gameofXOR(arr,n);
        System.out.println(result);
        sc.close();
    }
}
