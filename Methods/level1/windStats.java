import java.util.Scanner;

public class windStats {
    public double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        windStats windStats = new windStats();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the temperature (in Fahrenheit):");
        double temperature = input.nextDouble();

        System.out.println("Enter the wind speed (in mph):");
        double windSpeed = input.nextDouble();

        if (temperature <= 50 && windSpeed >= 3) {
            double windChill = windStats.calculateWindChill(temperature, windSpeed);
            System.out.println("The wind chill temperature is: " + windChill + "°F");
        } else {
            System.out.println("Wind chill calculation is valid only for temperatures ≤ 50°F and wind speeds ≥ 3 mph.");
        }

        input.close();
    }
}