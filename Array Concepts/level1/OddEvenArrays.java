import java.util.Scanner;
import java.util.ArrayList;
public class OddEvenArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();
        
        if (number <= 0) {
            System.out.println("Error: Enter a natural number greater than 0.");
            return;
        }
        ArrayList<Integer> odd = new ArrayList<>(), even = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            (i % 2 == 0 ? even : odd).add(i);
        }
        System.out.println("Odd numbers: " + odd);
        System.out.println("Even numbers: " + even);
        scanner.close();
    }
}
