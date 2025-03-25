import java.util.Scanner;

public class numberOps {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
        int arr[] = new int[5];
		
		for(int i = 0;i <= arr.length-1;i++) {
			
			System.out.println("enter number "+ (i+1));
			arr[i] = input.nextInt();
			if(arr[i] < 0) {
				System.out.println("negative");
			} else if(arr[i] > 0){
				System.out.println("positive");
				if(arr[i] % 2 == 0) {
					System.out.println("even");
				} else {
					System.out.println("odd");
				}
				
			} else {
				System.out.println("zero");
			}
			
			System.out.println("");
		};
        input.close();
	}
}