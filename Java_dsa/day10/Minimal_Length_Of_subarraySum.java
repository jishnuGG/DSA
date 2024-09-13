import java.util.Scanner;

public class Minimal_Length_Of_subarraySum {
    public static int find(int[] arr,int target,int n)
    {
          int minlength=Integer.MAX_VALUE;
          int currentSum=0;
          int start=0;
            for(int end=start;end<n;end++)
            {
                currentSum+=arr[end];
                while(currentSum>=target)
                {
                    minlength=Math.min(minlength, end-start+1);
                    currentSum-=arr[start];
                    start++;
                }
            }
          return (minlength==Integer.MAX_VALUE)?0:minlength;
           
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the target sum");
        int target=sc.nextInt();
        int result=find(arr, target, n);
        System.out.println(result);
        sc.close();
    }
}
