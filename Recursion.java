// This Java program calculates the factorial of a number using recursion
public class RecursiveExample {

    // Method to calculate factorial recursively
    public static int computeFactorial(int value) {
        if (value == 0 || value == 1) {
            return 1; // Base condition
        } else {
            return value * computeFactorial(value - 1); // Recursive call
        }
    }

    public static void main(String[] args) {
        int inputNumber = 7; // You can change this number
        int factorialResult = computeFactorial(inputNumber); // Call recursive method

        // Print the output
        System.out.println("The factorial of " + inputNumber + " is: " + factorialResult);
    }
}
