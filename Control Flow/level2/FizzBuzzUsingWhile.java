import java.util.Scanner;
class FizzBuzzUsingWhile{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("enter number");
		int n=input.nextInt();
		while(n>=0){
			if(n%3==0){
				System.out.println("Fizz");
				}
			else if(n%5==0){
				System.out.println("Buzz");
				}
			else{
				System.out.println(n);
				}
			n=n-1;
			}
	}
}
			
			
		