import java.util.Scanner;

public class Eliminating_Circle {
    public static int find(int n,int k)
    {
        if(n==1)
        {
            return 0;
        }
        return (find(n-1,k)+k)%n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
       System.out.println(find(n, k)+1);
       sc.close();

    }
}
