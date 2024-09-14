import java.util.Scanner;
public class PerfectSquare_using_binarySearch {
   
    public static boolean findtheperfect(int n,int low,int high)
    {
        if(low>high)
        {
            return false;
        }
       int mid=(low+high)/2;
       if((mid*mid) ==n)
       {
          return true;
       }
       else if((mid*mid)>n)
       {
        return findtheperfect(n, low, mid-1);
       }
       else{
         return findtheperfect(n, mid+1, high);
       }
    }
  public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean result=findtheperfect(n,1,n);
        System.out.println(result);
        sc.close();
    }
}


