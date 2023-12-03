                                          //TASK 1 STUDENT GRADE TRACKER

import java.util.Scanner;

public class task1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Create arrays to store student names and grades
        String[] studentNames = new String[numStudents];
        int[] studentGrades = new int[numStudents];

        // Input student names and grades
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            studentNames[i] = scanner.next();
            System.out.print("Enter the grade for " + studentNames[i] + ": ");
            studentGrades[i] = scanner.nextInt();
        }

        // Calculate average, highest, and lowest grades
        int sum = 0;
        int highestGrade = Integer.MIN_VALUE;
        int lowestGrade = Integer.MAX_VALUE;

        for (int grade : studentGrades) {
            sum += grade;
            highestGrade = Math.max(highestGrade, grade);
            lowestGrade = Math.min(lowestGrade, grade);
        }

        double average = (double) sum / numStudents;

        // Display results
        System.out.println("\nGrade Summary:");
        System.out.println("Average Grade: " + average);
        System.out.println("Highest Grade: " + highestGrade);
        System.out.println("Lowest Grade: " + lowestGrade);

        // Optional: Display individual student grades
        System.out.println("\nIndividual Student Grades:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println(studentNames[i] + ": " + studentGrades[i]);
        }

        scanner.close();
    }
}
