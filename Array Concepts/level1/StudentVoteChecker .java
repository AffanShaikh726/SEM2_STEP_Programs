import java.util.Scanner;
public class StudentVoteChecker  {
	public static void main(String[] args) {
		public static boolean canStudentVote(int age) {
			if (age < 0) {
				return false;
                System.out.println("Invalid age entered for student ");
            } else if (age >= 18) {
                return true;
            } else {
                return false;
            }
		}
	
	
		Scannner input= new Scanner(System.in);
		int[] ages = new int[10];
		 
		System.out.print("Enter age for student");
		for (int i=0;i<ages.length;i++) {
			System.out.print("Enter age for student" + (i+1) + "=");
			ages[i] = input.nextInt();
		}
		
		System.out.println("\nVoting Eligibility Results:");
        for (int i = 0; i < ages.length; i++) {
            if (canStudentVote(ages[i])) {
                System.out.println("The student with age " + ages[i] + " can vote.");
            } else {
                System.out.println("The student with age " + ages[i] + " cannot vote.");
            }
        }

        input.close();
    }
}