// This Java program uses a switch-case to print a message based on the day of the week
public class DayMessage {

    public static void main(String[] args) {
        int dayNumber = 3; // 1 = Monday, 2 = Tuesday, ..., 7 = Sunday

        // Switch-case to print messages for each day
        switch (dayNumber) {
            case 1:
                System.out.println("Monday - Start your week!");
                break;
            case 2:
                System.out.println("Tuesday - Keep going!");
                break;
            case 3:
                System.out.println("Wednesday - Midweek motivation!");
                break;
            case 4:
                System.out.println("Thursday - Almost there!");
                break;
            case 5:
                System.out.println("Friday - Weekend is near!");
                break;
            case 6:
                System.out.println("Saturday - Relax and enjoy!");
                break;
            case 7:
                System.out.println("Sunday - Rest well!");
                break;
            default:
                System.out.println("Invalid day!");
        }
    }
}
