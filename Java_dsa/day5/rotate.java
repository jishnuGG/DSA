import java.util.Scanner;

public class rotate{
   
    public static int[][] initialize(int row,int col)
    {
        int[][] arr=new int[row][col];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        sc.close();
        return arr;
    }
     /* 
    public static void print(int[][] arr,int row,int col)
    {
       
        for(int i=0;i<col;i++)
        {
            for(int j=row-1;j>=0;j--)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the row size");
        int r=sc.nextInt();
        System.out.println("enter the col size");
        int c=sc.nextInt();
        int[][] arr= initialize(r,c);
        
        print(arr,r,c);
        sc.close();
    }*/
   
    public static void transepose(int[][] arr,int row,int col)
    {
        for(int i=0;i<row;i++)
        {
        for(int j=i+1;j<col;j++)
        {
            int temp=arr[i][j];
            arr[i][j]=arr[j][i];
            arr[j][i]=temp;
        }
        }
        for(int i=0;i<row;i++)
        {
            int temp1;
            int start=0;
            int end=row-1;
             while(start<end)
             {
                 temp1=arr[i][start];
                 arr[i][start]=arr[i][end];
                 arr[i][end]=temp1;
                 start++;end--;
             }
             
        }


        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the row size");
        int r=sc.nextInt();
        System.out.println("enter the col size");
        int c=sc.nextInt();
        int[][] arr= initialize(r,c);
        transepose(arr,r,c);
        sc.close();
    }
}