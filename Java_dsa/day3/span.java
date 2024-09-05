import java.util.*;
public class span {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] arr=new int[a];
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
     //   System.out.println(max);
        for(int i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]>max)
            {
                max=arr[i];
            }
            else if(arr[i]<min){
                   min=arr[i];
            }
        }
        System.out.println("Span is:"+(max-min));
        sc.close();
    }
}
