import java.util.Scanner;

public class Smallest {
    public static void main(String[] args) {               
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        String answer;

        if (number1 < number2 && number1 < number3) {
            answer = " Yes";
        } else {
            answer = " No";
        }
        System.out.println(" Is the first number the smallest?" + answer);
        input.close();
    }
}
