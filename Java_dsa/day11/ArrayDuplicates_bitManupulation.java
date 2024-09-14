import java.util.*;;
public class ArrayDuplicates_bitManupulation {
    public static int nonrepeated(int[] arr,int n)
    {
       int nonrepeated=arr[0];
       for(int i=1;i<n;i++)
       {
        nonrepeated^=arr[i];
       }
       return nonrepeated;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int result=nonrepeated(arr, n);
        System.out.println(result);
        sc.close();
    }
}
