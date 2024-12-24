import java.util.Scanner;

public class SimpleCharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        int totalCharacters = inputString.length();

        int charactersExcludingSpaces = inputString.replace(" ", "").length();

        System.out.println("Total characters (including spaces): " + totalCharacters);
        System.out.println("Total characters (excluding spaces): " + charactersExcludingSpaces);

        scanner.close();
    }
}
