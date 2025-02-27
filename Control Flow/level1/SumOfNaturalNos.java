import java.util.Scanner;

public class SumOfNaturalNos{
    public static void main(String[] args) {   
        double number,sum;

        Scanner input = new Scanner(System.in);
        number = input.nextDouble();

        if (number < 1) {
            System.out.println("The number " + number + " is not a natural number");
        } else {
            sum = number * (number + 1)/2;
            System.out.println("The sum of" + number + "natural numbers is " + sum);
        }    
        input.close();
    }
}
