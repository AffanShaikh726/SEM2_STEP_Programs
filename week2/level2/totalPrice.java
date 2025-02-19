import java.util.Scanner;

public class totalPrice {
	public static void main(String[] args) {		
		double price;
		double quantity;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter price of item: ");
		price = input.nextDouble();
		System.out.println("Enter quantity of item: ");
		quantity = input.nextDouble();
		
		System.out.println("The total purchase price is INR  : " + (price*quantity) + " if the quantity " + quantity);
	}
}