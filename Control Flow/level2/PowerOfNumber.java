import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("base number: ");
        int number = input.nextInt();
        System.out.print("power: ");
        int power = input.nextInt();

        int result = 1;

        for (int i = 1; i <= power; i++) {
            result *= number;
        }
        System.out.println("Result: " + result);
        input.close();
    }
}