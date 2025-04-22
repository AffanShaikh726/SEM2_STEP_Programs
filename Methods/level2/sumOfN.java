import java.util.Scanner;

public class sumOfN {
	public static int recursionSum(int number,int sum) {
        if(number != 0 ) {
            sum += number;
            return recursionSum(number-1,sum);
        }
		else {
            return sum;
        }
	}

    public static int formulaSum(int number) {
		int sum = (number*(number+1))/2;
		return sum;
	}
	

    public static void main(String[] args) {        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a  no:");
        int n = input.nextInt();

        if (n > 0) {
            System.out.println("Recurson result = " + recursionSum(n,0));
            System.out.println("Formula result = " + formulaSum(n));

            System.out.println("\nBoth the resuls are EQUAL");
        } else {
            System.out.println("Please enter a positive no");
        }
		
		

		
        input.close();
    }

    
}