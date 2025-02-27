import java.util.Scanner;
class EmployesBonus{
	public static void main(String[] args){
		Scanner input=new 	Scanner(System.in);
		System.out.println("enter salary");
		double salary=input.nextInt();
		System.out.println("enter service years");
		double service=input.nextInt();
		if(service>5){
			double bonus=(5.0/100)*salary;
			salary=salary+bonus;
			System.out.println("The salary is "+salary+"\n bonus is "+bonus);
		}
		else{
			System.out.println("The salary is "+salary);
		}
	}
}