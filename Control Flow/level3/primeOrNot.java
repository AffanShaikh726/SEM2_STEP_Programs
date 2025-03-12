import java.util.Scanner;

class primeOrNot{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
        System.out.println("enter a number (>1)");
        int number = input.nextInt();
        int counter = 2;
        boolean isPrime = true;

        while(counter < number) {
            if(number % counter == 0) {
                isPrime = false;
                // System.out.println(isPrime);
                break;
            }
            counter += 1;
        }

        if(isPrime == true) {
            System.out.println("It is prime number");
        } else {
            System.out.println("It is not a prime number");
        }
        
        input.close();
	}
}