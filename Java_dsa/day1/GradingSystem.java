import java.util.*;
public class GradingSystem {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int score=sc.nextInt();
       if(score>=90 && score<=100){
        System.out.println("Grade A");
       }
       else if(score>=80 && score<=89)
       {
        System.out.println("grade B");
       }
       else if(score>=70 && score<=79)
       {
        System.out.println("grade C");
       }
       else if(score>=60 && score<=69)
       {
        System.out.println("grade D");
       }
       else if(score<=60){
        System.out.println("Grade F");
       }
       else{
        System.out.println("invalid");
       }
       sc.close();
    }
}