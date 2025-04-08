import java.util.Scanner;

public class handshakesMethod {
	
	public double combination (int n) {
        double result =  (n * (n-1))/2;
		return result
	} ;
		
	public static void main(String[] args) {
		handshakesMethod handShakeM = new handshakesMethod();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of students");
		int n = input.nextInt();
	
		System.out.println("Maximum HandShakes possible  " + handShakeM.combination(n));
		input.close();
	}
}