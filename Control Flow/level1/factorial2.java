import java.util.Scanner;

public class factorial2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive no.: ");
        int number = input.nextInt();

        if (number < 0) {
            System.out.println("Please enter a positive no.");
        } else {
            int factorial = 1;

            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            System.out.println("The factorial of " + number + " is " + factorial);
        }
        input.close();
    }
}