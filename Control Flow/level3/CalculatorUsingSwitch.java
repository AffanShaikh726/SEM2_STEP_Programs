import java.util.Scanner;
class CalculatorUsingSwitch{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("enter first number");
		double first=input.nextDouble();
		System.out.println("enter second number");
		double second=input.nextDouble();
		System.out.println("enter the operator");
		char op=input.next().charAt(0);
		int i=1;
		double result=0;
		switch(op){
			case '+':
				result=(first+second);
				break;
			case '-':
				result=(first-second);
				break;
			case '*':
				result=(first*second);
				break;
			case '/':
				result=(first/second);
				break;
			default:
				System.out.println("invalid number");
			}
		System.out.println("the result is : "+result);
	}
}
			
				
				
		