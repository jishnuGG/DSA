import java.util.*;
public class SecondLargest {
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++) arr[i]=sc.nextInt();
    int max=0;
    int max2=0;
    for(int i=0;i<n;i++)
    {
        if(arr[i]>max)
        {
            max2=max;
            max=arr[i];
        }
        else if(arr[i]>max2 && arr[i]<max)
        {
            max2=arr[i];
        }
    }
    
   /*
    for(int i=0;i<n;i++)
    {
        if(max<arr[i])
        {
            max=arr[i];
        }
    }
    int max2=0;
    for(int j=0;j<n;j++)
    {
        if(arr[j]>max2 && arr[j]!=max)
        {
            max2=arr[j];
        }
    }
         */
    System.out.println("element: "+max2);
    sc.close();
    }
}
