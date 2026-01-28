import java.util.Scanner;
public class sym {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows: ");
        int r=sc.nextInt();
        System.out.println("enter the number of columns: ");
        int c=sc.nextInt();
        
        int a[][]=new int[r][c];

        System.out.println("enter the elements:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        boolean symmetric=true;
        if(r!=c)
        {
            symmetric=false;
        }
        else{
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                {
                    if(a[i][j]!=a[j][i])
                    {
                        symmetric=false;
                        break;
                    }
                }
            }
        }
        if(symmetric)
        {
            System.out.println("symmetric");
        }
        else
        {
            System.out.println("not symmetric");
        }
    

    }
}
