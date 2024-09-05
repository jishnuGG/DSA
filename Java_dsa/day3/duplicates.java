import java.util.Scanner;

public class duplicates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        boolean a=false;
        System.out.println("Searching...");
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]==arr[i]){
                    a=true;
                    break;
                }
            }
        }
        if(a) System.out.println("Duplicates is found");
        else System.out.println("not  found");
        sc.close();
    }
}
