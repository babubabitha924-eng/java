import java.util.Scanner;

public class arithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int a = sc.nextInt();

        System.out.println("Enter the second number:");
        int b = sc.nextInt();

        while (true) {
            System.out.println("\n1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.println("Enter your choice:");

            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Sum is: " + (a + b));
                    break;

                case 2:
                    System.out.println("Difference is: " + (a - b));
                    break;

                case 3:
                    System.out.println("Product is: " + (a * b));
                    break;

                case 4:
                    if (b != 0) {
                        System.out.println("Quotient is: " + (a / (double) b));
                    } else {
                        System.out.println("Division by zero is not allowed");
                    }
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
