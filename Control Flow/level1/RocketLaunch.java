import java.util.Scanner;

public class RocketLaunch {
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the countdown start number: ");
        int counter = input.nextInt();
        
        System.out.println("Starting countdown : ");
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
        System.out.println("Launch succesful");
        input.close();
    }
}