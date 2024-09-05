import java.util.*;
public class largest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int max=0;
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        { 
            arr[i]=sc.nextInt();
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        System.out.println(max);
     sc.close();
    }
}
