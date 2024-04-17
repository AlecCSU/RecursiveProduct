import java.util.Scanner;

public class RecursiveProduct {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5]; // Array to store the five numbers

        // Prompt user to enter five numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter number " + (i + 1) + ":");
            numbers[i] = scanner.nextInt();
        }

        // Get the product of the numbers using recursion
        int product = multiplyNumbers(numbers, 0);
        System.out.println("The product of the entered numbers is: " + product);

        scanner.close();
    }

    // Recursive method to calculate product of the numbers
    private static int multiplyNumbers(int[] numbers, int index) {
        if (index == numbers.length) {
            return 1; // Base case: if index reaches the length of the array, return 1
        } else {
            return numbers[index] * multiplyNumbers(numbers, index + 1); // Recursive case
        }
    }
}
