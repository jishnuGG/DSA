import java.util.Scanner;

public class power_recursion {
    public static long power(int x,int n)
    {
        if(n==0)
        {
            return 1;
        }
        System.out.println("calculating ("+x+","+n+")");
        //  LOGARITHMIC APPROACH =>  2^a *2^b =2(a+b)
       long halfpower=power(x, n/2);
       if(n%2==0)
       {
        return halfpower*halfpower;
       }
       else{
        return x*halfpower*halfpower;
       }
    /*   LINEAR APPROACH
   return x*power(x, n-1);
    */
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        long result=power(x,n);
        System.out.println(result);
        sc.close();
    }
}
