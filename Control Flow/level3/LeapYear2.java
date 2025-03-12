import java.util.Scanner;

class LeapYear{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
        System.out.println("enter a year (>=1582)");
		int year = input.nextInt();

        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("IT is a LEAP YEAR");
        }   else {
            System.out.println("IT is NOT a LEAP YEAR");
        }

        input.close();
	}
}