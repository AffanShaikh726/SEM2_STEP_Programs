import java.util.Scanner;

public class AreaOfTriangle {
	public static void main(String[] args) {
		double base;
		double height;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter base of triangle(in cm): ");
		base = input.nextInt();
		System.out.println("Enter height of triangle(in cm): ");
		height = input.nextInt();
		
		double inchFactor = 2.54;//1 inch = 2.54cm
		double heightInInches = height/2.54;
		double baseInInches = base/2.54;
		
		System.out.println("The Area of the triangle in sq in is  : " + (0.5*heightInInches*baseInInches) + " and sq cm is " + (0.5*height*base));

	}
}