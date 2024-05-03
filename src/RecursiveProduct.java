import java.util.Scanner;
import java.util.InputMismatchException;

public class RecursiveProduct {

    /**
     * The main method that initializes the program.
     * It handles input collection and invokes the recursive multiplication.
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] numbers = new int[5];

            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = getIntFromUser(scanner, i);
            }

            int product = multiplyNumbers(numbers, 0);
            System.out.println("The product of the entered numbers is: " + product);
        }
    }

    /**
     * Recursive method to calculate product of numbers.
     * @param numbers Array of numbers to multiply.
     * @param index Current index in the array.
     * @return Product of numbers from current index onward.
     */
    private static int multiplyNumbers(int[] numbers, int index) {
        if (index == numbers.length) {
            return 1;
        }
        return numbers[index] * multiplyNumbers(numbers, index + 1);
    }

    /**
     * Prompts the user to input an integer, handling invalid inputs gracefully.
     * @param scanner Scanner object for user input.
     * @param index Index of the current number to provide appropriate prompts.
     * @return The validated integer input from the user.
     */
    private static int getIntFromUser(Scanner scanner, int index) {
        while (true) {
            try {
                System.out.println("Enter number " + (index + 1) + ":");
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.nextLine();
            }
        }
    }
}
