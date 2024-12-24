import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your ID number: ");
        String idNumber = scanner.nextLine();

        System.out.println("\nRegistration Successful!");
        System.out.println("Name: " + name);
        System.out.println("ID Number: " + idNumber);
      
        scanner.close();
    }
}
