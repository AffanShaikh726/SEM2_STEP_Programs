import java.util.Scanner;

public class UnitConvertor2 {

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Choose a conversion:");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("3. Pounds to Kilograms");
        System.out.println("4. Kilograms to Pounds");
        System.out.println("5. Gallons to Liters");
        System.out.println("6. Liters to Gallons");
        int choice = input.nextInt();

        System.out.println("Enter the value to convert:");
        double value = input.nextDouble();

        switch (choice) {
            case 1:
                System.out.println(value + " Fahrenheit is " + convertFahrenheitToCelsius(value) + " Celsius.");
                break;
            case 2:
                System.out.println(value + " Celsius is " + convertCelsiusToFahrenheit(value) + " Fahrenheit.");
                break;
            case 3:
                System.out.println(value + " Pounds is " + convertPoundsToKilograms(value) + " Kilograms.");
                break;
            case 4:
                System.out.println(value + " Kilograms is " + convertKilogramsToPounds(value) + " Pounds.");
                break;
            case 5:
                System.out.println(value + " Gallons is " + convertGallonsToLiters(value) + " Liters.");
                break;
            case 6:
                System.out.println(value + " Liters is " + convertLitersToGallons(value) + " Gallons.");
                break;
            default:
                System.out.println("Invalid choice.");
        }

        input.close();
    }
}