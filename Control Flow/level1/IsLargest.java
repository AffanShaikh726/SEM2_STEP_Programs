import java.util.Scanner;

public class IsLargest {
    public static void main(String[] args) {   
        int number1,number2,number3;

        Scanner input = new Scanner(System.in);
        number1 = input.nextInt();
        number2 = input.nextInt();
        number3 = input.nextInt();

        String answer1,answer2,answer3;

        if (number1 > number2 && number1 > number3) {
            answer1= " Yes";
        } else {
            answer1= " No";
        }

        if (number2 > number1 & number1 > number3) {
            answer2= " Yes";
        } else {
            answer2= " No";
        }

        if (number3 > number1 && number1 > number2) {
            answer3= " Yes";
        } else {
            answer3= " No";
        }
        
        System.out.println("Is the first number the largest? " + answer1);
        System.out.println("Is the second number the largest?" + answer2);
        System.out.println("Is the third number the largest? " + answer3);
        input.close();
    }
}
