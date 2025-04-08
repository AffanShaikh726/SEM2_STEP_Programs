import java.util.Scanner;

public class numberType {

    public static int checkNumberType(int num) {
        if (num > 0) {
            return 1;
        } else if (num < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        numberType numtype = new numberType();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer:");
        int number = input.nextInt();

        int result = numtype.checkNumberType(number);
        System.out.println("result : " + result);

        input.close();
    }

    
}