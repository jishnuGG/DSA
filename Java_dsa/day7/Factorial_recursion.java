import java.util.*;
public class Factorial_recursion {
    public static int factorial(int n)
    {
        int num=1;
        if(n>0){
         num= n*factorial(n-1);
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(factorial(n));
        sc.close();
    }
}
