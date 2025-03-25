import java.util.Scanner;

public class heightConverter {
	public static void main(String[] args) {		
		double height;
		System.out.println("Enter height(in cm) ");
		Scanner input = new Scanner(System.in);
		height = input.nextDouble();
		//1 inch = 2.54cm
		double heightInInches = height/2.54;
		//1 foot = 12 inches
		double heightInFeet = heightInInches/12;
		System.out.println("Your Height in cm is " + height + " while in feet is " + heightInFeet + " and inches is " + heightInInches);
		input.close();
	}
}