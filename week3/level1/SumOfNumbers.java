import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        double total = 0.0;
        double currentNumber;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the numbers to add (to stop and get the result enter 0): ");
        currentNumber = input.nextDouble();

        while (currentNumber != 0) {
            total = total + currentNumber;
            currentNumber = input.nextDouble();
        }

        System.out.print("Result :" + total);        
        input.close();
    }
}