import java.util.Scanner;

public class discountedFeesCalc {
	public static void main(String[] args) {
		double fees;
		Scanner input = new Scanner(System.in);
		fees = input.nextDouble();
		double discountPercent = 10;
		double discount = discountPercent * (fees/100);
		double discountedAmount = fees - discount;
		System.out.println("The discount amount is INR  " + discount + " and final discounted fee is INR " + discountedAmount);
	}
}