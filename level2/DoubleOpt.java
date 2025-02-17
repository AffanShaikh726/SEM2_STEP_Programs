import java.util.Scanner;

public class DoubleOpt {
	public static void main(String[] args) {
		double a;
		double b;
		double c;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 3 numbers : ");
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		double op1 = a + b * c;
		double op2 = a * b + c;
		double op3 = c + a / b;
		double op4 = a % b + c;
		
		System.out.println("The results of Int Operations are " + op1 + "," + op2 + "," + op3 + " and " + op4);
	}
}