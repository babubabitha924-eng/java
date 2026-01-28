import java.util.Scanner;
public class symmetric {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of rows");
        int rows=sc.nextInt();
        System.out.println("enter no of columns");
        int cols=sc.nextInt();
        int [][] matrix=new int[rows][cols];
        System.out.println("enter the elements");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
        boolean sym=true;
        if(rows!=cols)
        {
            sym=false;
        }
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
              if(matrix[i][j]!=matrix[j][i])
              {
               sym=false;
               break;
              }
            }
        }
        if(sym)
        {
            System.out.println("symmetric matrix");
        }
        else{
            System.out.println("not symmetric");
        }

    }
}
