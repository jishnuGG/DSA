import java.util.*;
public class lastIndex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the elements:");
        for(int i=0;i<n;i++)
        {
           arr[i]=sc.nextInt();
        }
          System.out.println("enter the element to find");
          int target=sc.nextInt();
      //    int index=Integer.MIN_VALUE;
          for(int i=n-1;i>=0;i--)
          {
            if(target==arr[i])
            {
               System.out.println(i);
               break;
            }
          }
          //System.out.println("Index:"+index);
          sc.close();
    }
}
