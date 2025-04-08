import java.util.Scanner;

public class simpleInterestMethod {
	
	public double SI(int principle,int rate,int time) {
		double si = (principle*rate*time)/100;
		return si;
	} ;
		
	public static void main(String[] args) {
		simpleInterestMethod SIM = new simpleInterestMethod();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Principle");
		int principle = input.nextInt();
		System.out.println("Rate(%)");
		int rate = input.nextInt();
		System.out.println("Time(Yrs)");
		int time = input.nextInt();
		
		
		System.out.println("simple interest is  " + SIM.SI(principle,rate,time));
		
		input.close();
	}
}