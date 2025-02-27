import java.util.Scanner;
class FizzBuzz{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("enter number");
		int n=input.nextInt();
		for(;n>0;n--){
			if(n%3==0){
				System.out.println("Fizz");
				}
			else if(n%5==0){
				System.out.println("Buzz");
				}
			else{
				System.out.println(n);
				}
			}
	}
}
			
			
		