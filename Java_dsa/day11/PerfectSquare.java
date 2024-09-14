import java.util.Scanner;

public class PerfectSquare {
    public static boolean findtheperfect(int n)
    {
        boolean flag=false;
        for(int i=1;i<n/2;i++)
        {
            if(i*i==n)
            {
                flag = true;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean result=findtheperfect(n);
        System.out.println(result);
        sc.close();
    }
}
