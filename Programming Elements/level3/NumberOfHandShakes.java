import java.util.Scanner;

public class  NumberOfHandShakes {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Number of students:");
        int numberOfStudents = input.nextInt();

        int numberOfHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        System.out.println("Maximum number of possible handshakes : " + numberOfHandshakes);
	}
}