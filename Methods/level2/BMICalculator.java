import java.util.Scanner;

public class BMICalculator {

    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double heightInMeters = data[i][1] / 100;
            data[i][2] = data[i][0] / (heightInMeters * heightInMeters);
        }
    }

    public static String[] determineBMIStatus(double[][] data) {
        String[] statuses = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi <= 18.4) {
                statuses[i] = "Underweight";
            } else if (bmi <= 24.9) {
                statuses[i] = "Normal";
            } else if (bmi <= 39.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }
        return statuses;
    }

    public static void main(String[] args) {
        
        double[][] data = new double[10][3];
        String[] statuses = new String[10];

        
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter weight (in kg) for person " + (i + 1) + ": ");
            data[i][0] = scanner.nextDouble(); 

            System.out.println("Enter height (in cm) for person " + (i + 1) + ": ");
            data[i][1] = scanner.nextDouble(); 
        }

    
        calculateBMI(data);
        statuses = determineBMIStatus(data);

    
        System.out.println("\nResults:");
        System.out.println("Person\tWeight (kg)\tHeight (cm)\tBMI\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t%s\n", 
                (i + 1), data[i][0], data[i][1], data[i][2], statuses[i]);
        }

        scanner.close();
    }

    
}