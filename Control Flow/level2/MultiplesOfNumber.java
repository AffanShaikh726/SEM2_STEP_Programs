import java.util.Scanner;

public class MultiplesOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number > 100) {
            System.out.print("Enter a number below 100");
        } else {
            for (int i = 100; i >= 1; i--) {
                // Checking if i perfectly divides number
                if (i % number == 0) {
                    System.out.println(i);
                }
            }
        }
        input.close();
    }
}