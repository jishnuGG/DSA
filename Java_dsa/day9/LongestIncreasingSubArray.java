import java.util.*;;
public class LongestIncreasingSubArray {
    public static int finmaxsub(int[] arr,int index,int currentLength,int max)
    {
        if(index==arr.length-1)
        {
            return Math.max(currentLength, max);
        }
         if(arr[index]<arr[index+1])
         {
        return  finmaxsub(arr, index+1,currentLength+1, max);
         }else{
          return  finmaxsub(arr, index+1,1, Math.max(currentLength, max));
         }
         
         
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        System.out.println(finmaxsub(arr, 0,1, 1));
        sc.close();
    }
}
