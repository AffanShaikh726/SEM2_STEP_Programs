import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[][] marks = new int[n][3];
        double[] percentages = new double[n];
        char[] grades = new char[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics: " : (j == 1) ? "Chemistry: " : "Maths: ";
                marks[i][j] = getValidInput(sc, subject);
            }
            percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;
            grades[i] = (percentages[i] >= 80) ? 'A' : (percentages[i] >= 70) ? 'B' : (percentages[i] >= 60) ? 'C' :
                        (percentages[i] >= 50) ? 'D' : (percentages[i] >= 40) ? 'E' : 'R';
        }
        
        System.out.println("\nStudent\tPhysics\tChemistry\tMaths\tPercentage\tGrade");
        for (int i = 0; i < n; i++)
            System.out.println((i + 1) + "\t" + marks[i][0] + "\t" + marks[i][1] + "\t" + marks[i][2] + "\t" + percentages[i] + "%\t" + grades[i]);
        
        sc.close();
    }
    private static int getValidInput(Scanner sc, String prompt) {
        int marks;
        do {
            System.out.print(prompt);
            marks = sc.nextInt();
        } while (marks < 0);
        return marks;
    }
}
