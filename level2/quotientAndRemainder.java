import java.util.Scanner;

public class quotientAndRemainder {
	public static void main(String[] args) {
		int number1;
		int number2;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		number1 = input.nextDouble();
		number2 = input.nextDouble();
		int quotient = number1/number2;
		int remainder = number1%number2;
		
		System.out.println("The Quotient is : " + quotient + " and Reminder is " + remainder + " of two number " + number1 + " and " + number2);
	}
}