import java.util.Scanner;

public class pivotindex {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("finding pivot index...");
        int leftsum=0;
        int rightsum=0;
        int totalsum=0;
  /*      OWN METHOD 
  for(i=0;i<n/2;i++)
        {
            leftsum+=arr[i];
        }
        for(int j=i+1;j<n;j++)
        {
            rightsum+=arr[j];
        }
        if(rightsum==leftsum)
        {
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }*/ 
        for(int i=0;i<n;i++)
        {
              totalsum+=arr[i];
        }
        for(int j=0;j<n;j++)
        {
            rightsum=totalsum-leftsum-arr[j];
            if(leftsum==rightsum)
            {
                System.out.println("index is:"+j);
                break;
            }
            leftsum+=arr[j];
        }
        sc.close();
    }
}