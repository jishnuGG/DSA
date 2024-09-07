import java.util.Scanner;

public class Spiral {
    public static int[][] initialize(int row,int col)
    {
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[row][col];
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
    public static void spiralMatrix(int[][] arr,int row,int col)
    {
      
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the row:");
        int row=sc.nextInt();
        System.out.println("enter the column:");
        int col=sc.nextInt();
        int[][] arr=initialize(row,col);
        spiralMatrix(arr,row,col);
        sc.close();
    }
}
