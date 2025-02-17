import java.util.Scanner;

public class  TemperatureConversion2 {
	public static void main(String[] args) {
		double farenheit;
        Scanner input = new Scanner(System.in);
        System.out.println("farenheit");
		farenheit = input.nextDouble();

        double celciusResult = (farenheit - 32) * 5/9;

		System.out.println("The " + farenheit + " farenheit is " + celciusResult + " celcius");

	}
}