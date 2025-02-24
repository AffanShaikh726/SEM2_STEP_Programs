import java.util.Scanner;

public class RocketLaucnh2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the countdown start number: ");
        int startNumber = input.nextInt();
        
        System.out.println("Starting countdown:");
        for (int counter = startNumber; counter >= 1; counter--) {
            System.out.println(counter);
        }
        System.out.println("Launch successful");
        input.close();
    }
}