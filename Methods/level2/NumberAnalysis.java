import java.util.Scanner;

public class NumberAnalysis {

    public static boolean isPositive(int number) {
        return number >= 0;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 == number2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        for (int number : numbers) {
            if (isPositive(number)) {
                if (isEven(number)) {
                    System.out.println(number + " is positive and even");
                } else {
                    System.out.println(number + " is positive and odd");
                }
            } else {
                System.out.println(number + " is negative");
            }
        }

        int result = compare(numbers[0], numbers[numbers.length - 1]);
        if (result == 1) {
            System.out.println("The first number is greater than the last number");
        } else if (result == 0) {
            System.out.println("The first number is equal to the last number");
        } else {
            System.out.println("The first number is less than the last number");
        }
        input.close();
    }
}