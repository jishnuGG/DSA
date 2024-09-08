import java.util.*;
public class SlidingWindow {
    public static int findingthesum(int[] arr,int n,int k)
    {
        int maxsum=0;
        if(n<k)
        {
            return -1;
        }
        for(int i=0;i<k;i++)
        {
            maxsum+=arr[i];
        }
        int window=maxsum;
        for(int j=k;j<n;j++)
        {
            window+=arr[j]-arr[j-k];
            maxsum=Math.max(maxsum, window);
        }
        return maxsum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int output=findingthesum(arr,n,k);
        
        System.out.println("largest sum using sliding window is:"+output);
        sc.close();
    }
}
