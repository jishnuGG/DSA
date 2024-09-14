import java.util.*;
public class Searching_linear {
    public static int linearsearch(int[] arr,int n,int target)
    {
           for(int i=0;i<n;i++)
           {
                   if(arr[i]==target)
                   {
                    return i+1;
                    
                   }
                   
           }
           return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int target=sc.nextInt();
        int result=linearsearch(arr, n,target);
        if(result>0) System.out.println("found at"+result);
        else {System.out.println("not found");}
        sc.close();
    }
}
