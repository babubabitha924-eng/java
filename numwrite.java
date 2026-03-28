import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

class filewrite {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter Source File Path:");
            String path = scanner.next();

            System.out.println("Enter odd file path:");
            String oddPath = scanner.next();

            System.out.println("Enter even file path:");
            String evenPath = scanner.next();

            Scanner fileScanner = new Scanner(new File(path));
            PrintWriter oddWriter = new PrintWriter(oddPath);
            PrintWriter evenWriter = new PrintWriter(evenPath);

            while (fileScanner.hasNextLine()) {
                int num = Integer.parseInt(fileScanner.nextLine());
                if (num % 2 == 0) {
                    evenWriter.println(num);
                } else {
                    oddWriter.println(num);
                }
            }
            fileScanner.close();
            oddWriter.close();
            evenWriter.close();
            System.out.println("Completed File Write");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}