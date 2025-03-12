import java.util.Scanner;
import java.lang.Math;

class ArmstrongNo{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
        System.out.println("enter a number");

        int number = input.nextInt();
        int originalNum = number;
        int sum = 0;

        while(number != 0) {            
            sum += Math.pow(number % 10, 3);
            number = number / 10;
            // System.out.println(number);
        }

        if(originalNum == sum) {
            System.out.println("It is armstrong number");
        } else {
            System.out.println("It is not a armstrong number");
        }
        
        input.close();
	}
}