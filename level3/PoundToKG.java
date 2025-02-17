import java.util.Scanner;

public class  PoundToKG {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Weight in pounds:");
        double pounds = input.nextDouble();

        double kg = pounds / 2.2;

        System.out.println(pounds + " pounds is equal to " + kg + " KG");
	}
}