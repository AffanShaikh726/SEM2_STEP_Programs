import java.util.Scanner;
class FindYoungestAndTallest{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("enter amar age");
		int amar=input.nextInt();
		System.out.println("enter amarheight");
		int amarheight=input.nextInt();
		System.out.println("enter akbar age");
		int akbar=input.nextInt();
		System.out.println("enter amarheight");
		int akbarheight=input.nextInt();
		System.out.println("enter anthony age");
		int anthony=input.nextInt();
		System.out.println("enter anthonyheight");
		int anthonyheight=input.nextInt();
		if(amar<akbar && amar<anthony){
			System.out.println("amar is the youngest");
			}
		else if(akbar<amar && akbar <anthony){
			System.out.println("akbar is the youngest");
			}
		else{
			System.out.println("anthony is the youngest");
			}
		
		if(amarheight>akbarheight && amarheight>anthonyheight){
			System.out.println("amar is the tallest");
			}
		else if(akbarheight>amarheight && akbarheight>anthonyheight){
			System.out.println("akbar is the tallest");
			}
		else{
			System.out.println("anthony is the tallest");
			}
	}
}
		