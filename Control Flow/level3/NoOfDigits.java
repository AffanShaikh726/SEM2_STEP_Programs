import java.util.Scanner;

class NoOfDigits{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
        System.out.println("enter a number");

        long number = input.nextLong();
        int counter = 0;

        while(number != 0) {   
			counter += 1;
            number = number / 10;
        }
		
		System.out.println("Number of digits = " + counter);
        input.close();
	}
}