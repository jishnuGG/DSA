import java.util.*;
public class ascending_Reverse {
    public static void Ascending_reverse(int n)
    {
     if(n>0)
     {
      System.out.println(n);
      Ascending_reverse(n-1);
      System.out.println(n);
     }
    }
      public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          Ascending_reverse(n);
          sc.close();
      }
}
