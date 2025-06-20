// This Java program demonstrates a 2D array to store student marks
public class StudentMarksDisplay {

    public static void main(String[] args) {
        // Array of student names
        String[] students = {"Alice", "Bob", "Charlie"};

        // 2D array representing marks for each student in 3 subjects
        int[][] marks = {
            {85, 90, 88},   // Marks for Alice
            {75, 80, 78},   // Marks for Bob
            {92, 89, 95}    // Marks for Charlie
        };

        // Display each student's marks
        System.out.println("Student Marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(students[i] + ": ");
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();  // Move to the next line for the next student
        }
    }
}
