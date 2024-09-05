import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int flag=0;
        if(a<=1) flag=1;
        for(int i=2;i<Math.sqrt(a);i++)
        {
              if(a%i==0)
              {
                flag=0;
              }
        }
        if(flag==0){
           System.out.println("prime");
        }
        else{
            System.out.println("Not a prime");
        }
        sc.close();
    }
}
