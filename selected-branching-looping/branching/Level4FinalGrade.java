import java.util.Locale;
import java.util.Scanner;

public class Level4FinalGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Enter the assignment score: ");
        double assignment = input.nextDouble();
        System.out.print("Enter the midterm score: ");
        double midterm = input.nextDouble();
        System.out.print("Enter the final exam score: ");
        double finalExam = input.nextDouble();
        System.out.print("Enter the attendance percentage: ");
        double attendance = input.nextDouble();

        double finalScore = assignment * 0.30 + midterm * 0.30 + finalExam * 0.40;
        char grade;

        if (attendance < 75) {
            grade = 'E';
        } else if (finalScore >= 85) {
            grade = 'A';
        } else if (finalScore >= 70) {
            grade = 'B';
        } else if (finalScore >= 55) {
            grade = 'C';
        } else if (finalScore >= 40) {
            grade = 'D';
        } else {
            grade = 'E';
        }

        System.out.printf(Locale.US, "Final Score = %.2f%n", finalScore);
        System.out.println("Grade = " + grade);

        input.close();
    }
}
