import java.util.Scanner;

public class  swapNumbers {
	public static void main(String[] args) {
		int number1;
        int number2;
        Scanner input = new Scanner(System.in);
        System.out.println("NUM1");
        number1 = input.nextInt();
        System.out.println("NUM2");
        number2 = input.nextInt();

        number2 = number1 + number2;
        number1 = number2 - number1;
        number2 = number2 - number1;
		System.out.println("The swapped numbers are " + number1 + " and " + number2);

	}
}