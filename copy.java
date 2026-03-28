import java.io.*;
import java.util.Scanner;

class FileCopy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter source file: ");
            String src = sc.nextLine();

            System.out.print("Enter destination file: ");
            String dest = sc.nextLine();

            FileInputStream inputStream = new FileInputStream(src);
            FileOutputStream outputStream = new FileOutputStream(dest);

            byte[] buffer;
            buffer = inputStream.readAllBytes();
            outputStream.write(buffer);

            outputStream.close();
            inputStream.close();

            System.out.println("File Copied");

        } catch (Exception e) {
            System.out.println(e);
        }

        sc.close();
    }
}