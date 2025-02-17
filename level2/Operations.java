import java.util.Scanner;

public class Operations {
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 3 numbers : ");
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		int op1 = a + b *c;
		int op2 = a * b + c;
		int op3 = c + a / b;
		int op4 = a % b + c;
		
		System.out.println("The results of Int Operations are " + op1 + "," + op2 + "," + op3 + " and " + op4);
	}
}