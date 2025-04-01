import java.util.Scanner;
public class BmiCalc2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number of people");
		int number= sc.nextInt();
		
		double[] [] personData = new double [n] [3];
		String[] weight = new String[n];
		
		for (int i = 0; i < n; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            personData[i][0] = sc.nextDouble();
            while (personData[i][0] <= 0) {
                System.out.print("Invalid weight! Enter a positive value: ");
                personData[i][0] = sc.nextDouble();
            }
            
            System.out.print("Enter height (m) of person " + (i + 1) + ": ");
            personData[i][1] = sc.nextDouble();
            while (personData[i][1] <= 0) {
                System.out.print("Invalid height! Enter a positive value: ");
                personData[i][1] = sc.nextDouble();
            }
            
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);
            
            if (personData[i][2] <= 18.4)
                weightStatus[i] = "Underweight";
            else if (personData[i][2] <= 24.9)
                weightStatus[i] = "Normal weight";
            else if (personData[i][2] <= 39.9)
                weightStatus[i] = "Overweight";
            else
                weightStatus[i] = "Obese";
        }
        
        System.out.println("\nPerson Details:");
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) + " - Height: " + personData[i][1] + " m, Weight: " + personData[i][0] + " kg, BMI: " + personData[i][2] + ", Status: " + weightStatus[i]);
        }
        
        sc.close();
    }
}
