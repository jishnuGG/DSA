import java.util.Scanner;

public class SumofAllnthXOR {
    public static int xor(int n)
    {
        if(n%4==1)
        {
            return 1;
        }
        else if(n%4==2)
        {
            return n+1;

        }
        else if(n%4==0)
        {
            return n;
        }
        else{
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result=xor(n);
        System.out.println(result);
        sc.close();
    }
}
