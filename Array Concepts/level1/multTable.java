import java.util.Scanner;

public class multTable {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number ");
		int number = input.nextInt();
        int arr[] = new int[10];
		
		for(int i = 0;i <= arr.length-1;i++) {
			arr[i] = number*(i+1);
			System.out.println(number + "*" + (i+1) + " = " + arr[i]);
		};
        input.close();
	}
}