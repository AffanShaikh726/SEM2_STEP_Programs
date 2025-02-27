import java.util.Scanner;

public class SpringOrNot {
    public static void main(String[] args) {               
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
        
        if (goAhead == true) {
            if(month == 3 && day >=20) {
                System.out.println("Its a Spring Season");
            }
            else if(month == 4 || month == 5) {
                System.out.println("Its a Spring Season");
            }
            else if (month == 6 && day <=20) {
                System.out.println("Its a Spring Season");
            } else {
                System.out.println("Not Spring Season");
            }
        }

        input.close();
    }
}
