import java.util.Scanner;

public class TotalRoundsM {
    public int rounds(int s1,int s2,int s3) {
        int perimeter = s1 + s2 + s3;
        int result = 5000 / perimeter;//5km/perimeter
        if (5000 % perimeter != 0) {
            result += 1; // Add an extra round if there is a remainder
        }
        return result;
    }

    public static void main(String[] args) {
        TotalRoundsM TRM = new TotalRoundsM();
        int side1,side2,side3; 

        Scanner input = new Scanner(System.in);

        System.out.println("enter the side(metres)");
        System.out.println("Side1");
        side1 = input.nextInt();
        System.out.println("Side2");
        side2 = input.nextInt();
        System.out.println("Side3");
        side3 = input.nextInt();

        if (side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2) {
            System.out.println("The total number of rounds the athlete will run is " + TRM.rounds(side1,side2,side3) + " to complete 5 km ");
        } else {
            System.out.println("Please enter valid side lengths");
        }
        
        
        input.close();
    }
}
