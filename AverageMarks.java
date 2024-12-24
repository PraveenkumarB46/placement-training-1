import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        double totalMarks = 0;

        for (int i = 1; i <= numberOfStudents; i++) {
            System.out.print("Enter marks for student " + i + ": ");
            double marks = scanner.nextDouble();
            totalMarks += marks; // Add marks to total
        }
        double averageMarks = totalMarks / numberOfStudents;
        System.out.printf("The average marks of the class is: %.2f%n", averageMarks);
      
        scanner.close();
    }
}
