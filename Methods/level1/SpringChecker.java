import java.util.Scanner;

public class SpringChecker {
	
	public boolean checkForSpring (int month,int day) {
        boolean spring = false;
        
        if ((month == 3 && day >=20) || (month == 4 || month == 5) || (month == 6 && day <=20)) {
            spring = true;
        }

        return spring;
	} ;
		
	public static void main(String[] args) {
        SpringChecker checkSpring = new SpringChecker();
		Scanner input = new Scanner(System.in);
        System.out.println("enter day");
        int day = input.nextInt();

        System.out.println("enter month");
        int month = input.nextInt();

        boolean goAhead = true;
        
        if(day < 1 || month > 31) {
            System.out.println("Please enter a valid day");
            goAhead =  false;
        }
        if (month < 1 || month > 12) {
            System.out.println("PLease enter a valid month");
            goAhead =  false;
        }

        if (goAhead) {
            System.out.println("Spring = " + checkSpring.checkForSpring(month, day));
        }
        input.close();
	}
}
// if(month == 3 && day >=20) {
        //     //System.out.println("Its a Spring Season");
        //     spring = true;
        // }
        // else if(month == 4 || month == 5) {
        //     // System.out.println("Its a Spring Season");
        //     spring = true;
        // }
        // else if (month == 6 && day <=20) {
        //     // System.out.println("Its a Spring Season");
        //     spring = true;
        // } else {
        //     // System.out.println("Not Spring Season");
        // }