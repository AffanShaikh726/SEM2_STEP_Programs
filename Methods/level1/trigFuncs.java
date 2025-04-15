import java.util.Scanner;

public class trigFuncs {
    public double[] calculateTrigonometricFunctions(double angle) {
        double[] results = new double[3];
        double radians = Math.toRadians(angle); //  to radians

        results[0] = Math.sin(radians); // Sin
        results[1] = Math.cos(radians); // Cos
        results[2] = Math.tan(radians); // Tan

        return results;
    }

    public static void main(String[] args) {
        trigFuncs trigFunctions = new trigFuncs();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the angle(degrees):");
        double angle = input.nextDouble();

        double[] results = trigFunctions.calculateTrigonometricFunctions(angle);

        System.out.println("Sine of " + angle + " degrees: " + results[0]);
        System.out.println("Cos of " + angle + " degrees: " + results[1]);
        System.out.println("Tan of " + angle + " degrees: " + results[2]);

        input.close();
    }
}