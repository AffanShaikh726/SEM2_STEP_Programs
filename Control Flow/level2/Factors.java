import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        for (int i = 1; i <= number; i++) {
            // if the number perfectly divisible by i
            if (number % i == 0) {
                System.out.println(i);
            }
        }

        input.close();
    }
}