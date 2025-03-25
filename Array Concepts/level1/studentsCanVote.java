import java.util.Scanner;

public class studentsCanVote {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
        int arr[] = new int[10];
		
		for(int i = 0;i <= arr.length-1;i++) {
			
			System.out.println("enter age of student "+ (i+1));
			arr[i] = input.nextInt();
			if(arr[i] < 0) {
				System.out.println("invalid age");
			} else if(arr[i] >= 18){
				System.out.println("The student with the age "+ arr[i] + " can vote");
			} else {
				System.out.println("The student with the age "+ arr[i] + " cannot vote");
			}
			
			System.out.println("");
		};
        input.close();
	}
}