import java.util.Scanner;
class CheckPNZ{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("enter ur num");
		int num;
		num=input.nextInt();
		if(num>0){
			System.out.println("Number is positive");
			}
		else if(num<0){
			System.out.println("number is negative");
			}	
		else{
			System.out.println("number is 0");
			}
	}
}