import java.util.Scanner;

public class SGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[] phy = new int[n], chem = new int[n], math = new int[n];
        double[] perc = new double[n];
        char[] grades = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            phy[i] = getValidInput(sc, "Physics: ");
            chem[i] = getValidInput(sc, "Chemistry: ");
            math[i] = getValidInput(sc, "Maths: ");
            perc[i] = (phy[i] + chem[i] + math[i]) / 3.0;
            grades[i] = (perc[i] >= 80) ? 'A' : (perc[i] >= 70) ? 'B' : (perc[i] >= 60) ? 'C' : 
                        (perc[i] >= 50) ? 'D' : (perc[i] >= 40) ? 'E' : 'R';
        }

        System.out.println("\nStudent\tPhysics\tChemistry\tMaths\tPercentage\tGrade");
        for (int i = 0; i < n; i++)
            System.out.println((i + 1) + "\t" + phy[i] + "\t" + chem[i] + "\t" + math[i] + "\t" + perc[i] + "%\t" + grades[i]);
        
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
