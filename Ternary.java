// This Java program uses the ternary operator to check for a leap year
public class LeapYearCheck {

    public static void main(String[] args) {
        int daysInFebruary = 29;   // Number of days in February
        String result;

        // Use ternary operator to check if it's a leap year
        result = (daysInFebruary == 28) ? "Not a leap year" : "Leap year";

        // Print the result
        System.out.println(result);
    }
}
