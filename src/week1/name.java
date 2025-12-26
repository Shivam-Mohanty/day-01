package week1;
import java.util.Scanner;

public class name {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String fname = scanner.nextLine();

        System.out.println("Enter your last name:");
        String lname = scanner.nextLine();

        System.out.println("Output: " + lname + " " + fname);
    }
}
