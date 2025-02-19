import java.util.Scanner;

public class DistanceConverter {
	public static void main(String[] args) {		
		double feet;
		System.out.println("Enter distance(in feet) ");
		Scanner input = new Scanner(System.in);
		feet = input.nextDouble();
		double yardFactor = 3;//1 yard = 3feet
		double distInYards = feet/yardFactor;
		
		double mileFactor = 1760;//1 mile = 1760 yards
		double distInMiles = distInYards/mileFactor;
		System.out.println("The distance in yards is " + distInYards + " while the distance in miles is " + distInMiles);
	}
}