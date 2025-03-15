import java.util.Scanner;
class CheckHarshad{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int count=0;
		System.out.println("enter number to check digits");
		int number=input.nextInt();
		int i=number;
		while(i!=0){
			i=i/10;
			count=count+1;
			}
		if(number%count==0){
			System.out.println("The number is harshad");
		}
		else{
			System.out.println("The number is not harshad");
		}
	}
}