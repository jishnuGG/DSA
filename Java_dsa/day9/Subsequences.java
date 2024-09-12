import java.util.*;;
public class Subsequences {
    public static void fun(String s,String current,int index)
    {
        if(index==s.length())
        {
            System.out.println(current);
            return;
        }
        fun(s, current+s.charAt(index), index+1);
        fun(s, current, index+1);
    }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      fun(s,"",0);
      sc.close();
    }
}
