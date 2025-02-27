import java.util.Scanner;

public class kmToMileConverter {
	public static void main(String[] args) {		
		double km;
		Scanner input = new Scanner(System.in);
		km = input.nextDouble();
		double mileFactor = 1.6;//1 km = 1.6 miles
		double requiredMiles = km*mileFactor;
		System.out.println("The distance " + km + " km in miles is " + requiredMiles);
	}
}