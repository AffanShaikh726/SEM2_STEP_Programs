import java.util.Scanner;

public class  SimpleInterest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.println("Principal :");
        double principal = input.nextDouble();

        System.out.println("Rate of Interest:");
        double rate = input.nextDouble();

        System.out.println("Time period (in years):");
        double time = input.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;

        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);
	}
}