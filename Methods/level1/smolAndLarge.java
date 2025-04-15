import java.util.Scanner;

public class smolAndLarge {
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest = number1;
        int largest = number1;
        int arr[] = new int[2];

        // Compare to find the smallest
        if (number2 < smallest) {
            smallest = number2;
        }
        if (number3 < smallest) {
            smallest = number3;
        }

        // Compare to find the largest
        if (number2 > largest) {
            largest = number2;
        }
        if (number3 > largest) {
            largest = number3;
        }

        arr[0] = smallest;
        arr[1] = largest;

        return arr;
    }

    public static void main(String[] args) {        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a 3 no.s :");
        int n1 = input.nextInt(),n2 = input.nextInt(),n3 = input.nextInt();

        int[] result = findSmallestAndLargest(n1, n2, n3);

        System.out.println("Smallest number: " + result[0]);
        System.out.println("Largest number: " + result[1]);

        input.close();
    }

    
}