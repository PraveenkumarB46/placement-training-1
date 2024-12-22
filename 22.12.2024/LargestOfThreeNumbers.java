public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 15; // Three numbers
        int largest = a > b ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("Largest number is: " + largest);
    }
}
