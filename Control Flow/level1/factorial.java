import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive no.: ");
        int number = input.nextInt();

        if (number < 0) {
            System.out.println("Enter a positive no.");
        } else {
            int factorial = 1;
            int i = 1;

            while (i <= number) {
                factorial *= i;
                i++;
            }

            System.out.println("The factorial of " + number + " is " + factorial);
        }
        input.close();
    }
}