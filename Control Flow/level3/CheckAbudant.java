import java.util.Scanner;
class CheckAbudant{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int sum=0;
		System.out.println("enter number to check abudant");
		int number=input.nextInt();
		int i=1;
		while(i<number){
			if(number%i==0){
				sum=sum+i;
				}
			i=i+1;
		}
		if(sum>number){
			System.out.println("the Number is Abudant");
			}
		else{
			System.out.println("the Number is not abudant");
			}
	}
}