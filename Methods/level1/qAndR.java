import java.util.Scanner;

public class qAndR {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int[] result = new int[2];
        result[0] = number / divisor; 
        result[1] = number % divisor; 
        return result;
    }

    public static void main(String[] args) {        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number:");
        int number = input.nextInt();

        System.out.println("Enter the divisor:");
        int divisor = input.nextInt();

        if (divisor != 0) {
            int[] result = findRemainderAndQuotient(number, divisor);
            System.out.println("Quotient: " + result[0]);
            System.out.println("Remainder: " + result[1]);
        } else {
            System.out.println("Divisor cannot be zero");
        }

        input.close();
    }
}