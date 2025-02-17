import java.util.Scanner;

public class sideOfSqr {
	public static void main(String[] args) {
		double perimeter;
		double side;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter perimeter of square : ");
		perimeter = input.nextDouble();
		side = perimeter/4;
		System.out.println("Side of square = " + side);
	}
}