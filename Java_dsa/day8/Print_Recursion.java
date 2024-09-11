import java.util.*;
public class Print_Recursion {
    public static void print(int n)
    {
        if(n>0)
        {
            System.out.println("ALGOTUTOR");
        }
        else if(n<=0) return;
        print(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        print(n);
        sc.close();
    }
}