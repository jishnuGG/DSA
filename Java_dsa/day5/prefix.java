import java.util.Scanner;
//same as SumOfSubArray
public class prefix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       int[] arr=new int[n];
    System.out.println("enter the elements:");
    for(int i=0;i<n;i++)
     {
      arr[i]=sc.nextInt();

     }
     System.out.println("enter the range:");
     int n1=sc.nextInt();
     int n2=sc.nextInt();
    
     int[] prefix=new int[n];
     int sum=0;
     for(int i=0;i<n;i++)
     {
      sum+=arr[i];
      prefix[i]=sum;
     }
    if(n1==0)
    {
      System.out.println(prefix[n2]);
    } 
    else{
      int sum1=prefix[n2]-prefix[n1-1];
      System.out.println(sum1);
    }
    sc.close();
     
   }
}
