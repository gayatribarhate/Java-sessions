// This Java program displays the subject marks of each student using a 2D array
public class StudentMarkSheet {

    public static void main(String[] args) {
        // Array holding student names
        String[] studentNames = {"Alice", "Bob", "Charlie"};

        // 2D array containing marks of each student in 3 subjects
        int[][] subjectMarks = {
            {85, 90, 88},   // Alice's marks
            {75, 80, 78},   // Bob's marks
            {92, 89, 95}    // Charlie's marks
        };

        // Display the marks of each student
        System.out.println("Student Marks:");
        for (int i = 0; i < subjectMarks.length; i++) {
            System.out.print(studentNames[i] + ": ");
            for (int j = 0; j < subjectMarks[i].length; j++) {
                System.out.print(subjectMarks[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each student's marks
        }
    }
}
