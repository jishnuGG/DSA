import java.util.Scanner;

public class fibonacci {
    public static void Fibonacci(int n,int k)
    {
        if(n<=k)
        {
          System.out.println(k);
          Fibonacci(n-1, k);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        Fibonacci(n, k);
        sc.close();
    }
}
