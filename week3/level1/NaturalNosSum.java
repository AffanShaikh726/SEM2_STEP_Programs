import java.util.Scanner;

public class NaturalNosSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a number greater than 0.");
        } else {
            int whileSum = 0;
            int counter = 1;
            while (counter <= n) {
                whileSum += counter;
                counter++;
            }

            int formulaSum = n * (n + 1) / 2;

            System.out.println("Sum using while loop: " + whileSum);
            System.out.println("Sum using formula: " + formulaSum);

            if (whileSum == formulaSum) {
                System.out.println("Both are correct.");
            } else {
                System.out.println("There is a difference");
            }
        }

        input.close();
    }
}