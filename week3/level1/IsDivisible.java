import java.util.Scanner;

public class IsDivisible {
    public static void main(String[] args) {               
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a no.(>0)");
        int number = input.nextInt();
        String answer;

        if (number % 5 == 0) {
            answer = " Yes";
        } else {
            answer = " No";
        }
        System.out.println("Is the number " + number + "  divisible by 5? " + answer);
        input.close();
    }
}
