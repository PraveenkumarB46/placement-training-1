import java.util.Scanner;

public class StudentAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        int currentYear = 2024; // You can also use LocalDate for dynamic current year
      
        System.out.print("Enter the birth year of the student: ");
        int birthYear = scanner.nextInt();
      
        int age = currentYear - birthYear;
        System.out.println("The age of the student is: " + age + " years.");

        scanner.close();
    }
}
