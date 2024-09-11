import java.util.*;
public class Product_Recursion {
    public static int product(int a,int b)
    {
        if(b==0)
        {
            return 0;
        }
            return a+(product(a, b-1));
        
       // return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int result=product(a,b);
        System.out.println("product is:"+result);
        sc.close();
    }
}
