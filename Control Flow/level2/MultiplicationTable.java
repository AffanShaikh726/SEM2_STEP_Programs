import java.util.Scanner;
class MultiplicationTable{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("enter number to multiply");
		int n=input.nextInt();
		int i=6;
		for(;i<=9;i++){
			int product=n*i;
			System.out.println(n+"*"+i+"="+product);
			}
	}
}