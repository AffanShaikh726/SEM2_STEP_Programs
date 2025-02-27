import java.util.Scanner;
class PrintOddEven{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("enter till where u want to check odd even");
		int n=input.nextInt();
		for(;n>0;n--){
			if (n%2==0){
				System.out.println(n+" is an even number");
				}
			else{
				System.out.println(n+"is an odd number");
				}	
			}
	}
}
		