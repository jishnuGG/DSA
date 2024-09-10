import java.util.Scanner;

public class fibonacci {
    public static int Fibonacci(int n)
    {
        if(n==1)
        {
            return 1;
        }
        else if(n==0)
        {
            return 0;
        }
        return Fibonacci(n-1)+Fibonacci(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       
        System.out.println( Fibonacci(n));
        sc.close();
    }
}
