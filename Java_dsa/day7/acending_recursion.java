import java.util.*;
public class acending_recursion {

  public static void Ascending(int n)
  {
   if(n>0)
   {
    Ascending(n-1);
    System.out.println(n);
   }
  }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Ascending(n);
        sc.close();
    }
}
