import java.util.Scanner;
import java.lang.Math;


public class operationsOnFactors {
    public static int[] findfactor(int number) {
		int count = 0;
		for(int i =1;i <= number;i++) {
			if(number % i == 0) {
				count++;
			}
		}
		
		int arr[] = new int[count];
		int indexCount = 0;
		
		for(int j =1;j <= number;j++) {
			if(number % j == 0) {
				arr[indexCount] = j;
				System.out.println(indexCount + " : " + arr[indexCount]);
				indexCount++;
			}
		}	
		
        return arr;
    }
	
	public static int sumOfFactors(int[] fArr) {
		int sum = 0;
		for(int k =0;k < fArr.length;k++) {
			sum += fArr[k];
		}
		
		return sum;
	}
	
	public static int productOfFactors(int[] fArr) {
		int product = 1;
		for(int k =0;k < fArr.length;k++) {
			product *= fArr[k];
		}
		
		return product;
	}
	
	public static int sumOfSqrs(int[] fArr) {
		int sos = 0;
		for(int k =0;k < fArr.length;k++) {
			sos += Math.pow(fArr[k],2);
		}
		
		return sos;
	}

    public static void main(String[] args) {        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a  no:");
        int n = input.nextInt();

        int[] result = findfactor(n);
		
		System.out.println("Sum of the factors = " + sumOfFactors(result));
		System.out.println("Product of the factors = " + productOfFactors(result));
		System.out.println("Sum of Squares of the factors = " + sumOfSqrs(result));

        input.close();
    }

    
}