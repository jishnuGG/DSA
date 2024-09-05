import java.util.Scanner;

class positive_negative{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>0)
        {
            System.out.println("positive");
        }
        else if(a==0)
        {
            System.out.println("Zero");
        }
        else if(a<0){
            System.out.println("negative");
        }
        else{
            System.out.println("invalid");
        }
        sc.close();
    }
}