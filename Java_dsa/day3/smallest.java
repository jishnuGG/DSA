import java.util.Scanner;

public class smallest {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
       
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        { 
            arr[i]=sc.nextInt();
            
        }
        int min=arr[0];
        for(int i=0;i<n;i++)
        {
            if(min>arr[i])
            min=arr[i];
        }
        System.out.println(min);
     sc.close();
    }
}
