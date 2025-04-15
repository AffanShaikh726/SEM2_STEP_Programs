import java.util.Scanner;

public class divChocolates {

    // Method to find the quotient (chocolates per child) and remainder (remaining chocolates)
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int[] result = new int[2];
        result[0] = number / divisor; // Chocolates each child gets
        result[1] = number % divisor; // Remaining chocolates
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of chocolates:");
        int numberOfChocolates = input.nextInt();

        System.out.println("Enter the number of children:");
        int numberOfChildren = input.nextInt();

        if (numberOfChildren > 0) {
            int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);
            System.out.println("Each child gets: " + result[0]);
            System.out.println("Remaining chocolates: " + result[1]);
        } else {
            System.out.println("Number of children cannot be zero.");
        }

        input.close();
    }
}