import java.util.Scanner;

public class calc {
	public static void main(String[] args) {
		double number1;
		double number2;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		number1 = input.nextInt();
		number2 = input.nextInt();
		System.out.println("Addition result : " + (number1+number2));
		System.out.println("Subtraction result : " + (number1-number2));
		System.out.println("Multiplication result : " + (number1*number2));
		System.out.println("Division result : " + (number1/number2));
	}
}