import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    int count=0;
    int product=1;
    int left=0;
   for(int right=0;right<n;right++)
   {
    product*=arr[right];
    while(product>=100)
    {
        product/=arr[left];
        left++;
    }
    count+=right-left+1;

   }
   System.out.println(count);
     sc.close();
    }
}
