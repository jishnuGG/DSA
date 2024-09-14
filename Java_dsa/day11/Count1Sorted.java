import java.util.Scanner;

public class Count1Sorted {
    public static int find(int[] arr,int low,int high)
    {
        if(low>=high)
        {
            return 0;
        }
       
        while (low<high) {
            int mid=(low+high)/2;
            if((arr[mid]==1 && (arr[mid-1]==0 || mid==0)))
            {
                return mid+1;
            }
            else if(arr[mid]==0){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return 0;
        /*
        if((arr[mid]==1 && (arr[mid-1]==0 || mid==0)))
        {
            return mid+1;
        }
        else if(arr[mid]==0){
            return find(arr, mid+1, high);
        }
        else   
            return find(arr, low, mid-1);
        }
         */
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int result=find(arr,0,n-1);
        System.out.println("contains :"+result+" 1's");
        sc.close();

    }
}