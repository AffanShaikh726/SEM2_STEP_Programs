import java.util.Scanner;

public class sumMethod {
    public int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        sumMethod sumMethod = new sumMethod();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a positive no. (n):");
        int n = input.nextInt();

        if (n > 0) {
            int sum = sumMethod.calculateSum(n);
            System.out.println("Result = " + sum);
        } else {
            System.out.println("Please enter a positive integer.");
        }

        input.close();
    }

    
}