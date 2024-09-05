import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
     if(a==1 || a==0)
     {
        System.out.println(1);
     }
     else{
        int fact=1;
          for(int i=1;i<=a;i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);
     }
     sc.close();
    }
}
