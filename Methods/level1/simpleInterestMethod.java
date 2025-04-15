import java.util.Scanner;

public class simpleInterestMethod {
	
	public static double SI(int principle,int rate,int time) {
		double si = (principle*rate*time)/100;
		return si;
	} ;
		
	public static void main(String[] args) {
		//simpleInterestMethod SIM = new simpleInterestMethod();
		Scanner input = new Scanner(System.in);
		
		int principle = input.nextInt();
		int rate = input.nextInt();
		int time = input.nextInt();
		
		
		System.out.println("simple interest is  " + SI(principle,rate,time));
		
		input.close();
	}
}