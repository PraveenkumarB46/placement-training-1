import java.util.Scanner;

public class ChangeLowerToUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String upperCaseString = inputString.toUpperCase();

        System.out.println("Uppercase String: " + upperCaseString);
    }
}
