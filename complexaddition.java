import java.util.Scanner;
public class complexaddition {
    Scanner sc= new Scanner(System.in);
    System.out.println
    ("enter the real part of first:");
    int r1=sc.nextInt();
    System.out.println("enter the imaginary part of first:");
    int i1=sc.nextInt();
    System.out.println("enter the real part of second:");
    int r2=sc.nextInt();
    System.out.println("enter the imaginary part of second:");
    int i2=sc.nextInt();

    int realsum=r1+r2;
    int imgsum=i1+i2;

    System.out.println("sum="+realsum+imgsum+"i");


}
