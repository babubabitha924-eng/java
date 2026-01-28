import java.util.Scanner;
public class complex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter real part of first ");
        int real1 = sc.nextInt();
        System.out.print("Enter imaginary part of first ");
        int img1 = sc.nextInt();
        System.out.print("Enter real part of second ");
        int real2 = sc.nextInt();
        System.out.print("Enter imaginary part of second ");
        int img2 = sc.nextInt();
        int real3=real1+real2;
        int img3=img1+img2;
        System.out.println(real3+"+"+img3+"i");
    }
}
