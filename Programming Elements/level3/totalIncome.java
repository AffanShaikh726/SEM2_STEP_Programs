import java.util.Scanner;

public class  totalIncome {
	public static void main(String[] args) {
		double salary;
        double bonus;
        Scanner input = new Scanner(System.in);
        System.out.println("Salary");
        salary = input.nextDouble();
        System.out.println("Bonus");
        bonus = input.nextDouble();

        double income = salary + bonus;

		System.out.println("The salary is INR " + salary + " and the bonus is INR " + bonus + " Hence, the total income is INR " + income);

	}
}