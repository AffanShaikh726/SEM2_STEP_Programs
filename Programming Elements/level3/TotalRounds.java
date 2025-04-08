import java.util.Scanner;

public class TotalRounds {
	public static void main(String[] args) {
		int side1;
        int side2;
        int side3;
        Scanner input = new Scanner(System.in);
        System.out.println("enter the side(metres)");
        System.out.println("Side1");
        side1 = input.nextInt();
        System.out.println("Side2");
        side2 = input.nextInt();
        System.out.println("Side3");
        side3 = input.nextInt();

        int perimeter = side1 + side2 + side3;

        // Calculate the number of rounds
        int rounds = 5000 / perimeter;
        if (5000 % perimeter != 0) {
            rounds += 1; // Add an extra round if there is a remainder
        }
        
		System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km ");
        input.close();
	}
}