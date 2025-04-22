import java.util.Scanner;

public class leapYearMethod {
    public static void isLeapYearOrNot(int year) {
        if (year >= 1582) {
            if(year % 4 == 0 && year % 100 != 0) {
                System.out.println("IT is a LEAP YEAR");
            }   
            else if (year % 400 == 0) {
                System.out.println("IT is a LEAP YEAR");
            }   
            else {
                System.out.println("IT is NOT a LEAP YEAR");
            }
        } else {
            System.out.println("pls enter a valid year (>=1582)");
        }
		
	}

    public static void main(String[] args){
		Scanner input = new Scanner(System.in);
        System.out.println("enter a year (>=1582)");
        isLeapYearOrNot(input.nextInt());
        input.close();
	}
}
