import java.util.Scanner;

public class CountAlphabets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        int count = 0; 
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                count++;
            }
        }

        System.out.println("Number of alphabetic characters: " + count);
    }
}
