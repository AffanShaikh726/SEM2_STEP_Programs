public class discountedFees {
	public static void main(String[] args) {
		double fees = 125000;
		double discountPercent = 10;
		double discount = discountPercent * (fees/100);
		double discountedAmount = fees - discount;
		System.out.println("The discount amount is INR  " + discount + " and final discounted fee is INR " + discountedAmount);
	}
}