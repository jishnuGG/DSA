import java.util.Scanner;

public class HammingDistance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int count=0;
        int result=a^b;
        while(result!=0)
        {
            count+=result&1;
            
            result>>=1;
            
        }
        System.out.println(count);sc.close();
    }
}