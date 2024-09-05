import java.util.*;
public class SwapFirstandLast {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();int[] arr=new int[n];
         for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int temp;
       temp=arr[n-1];
       arr[n-1]=arr[0];
       arr[0]=temp;
       for (int i : arr)
    {
        System.out.println(i);
       }
       sc.close();
    }
}
