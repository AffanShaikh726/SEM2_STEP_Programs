import java.util.Scanner;
class VoteCheck {
	public static void main(String[] args) {
		Scannner input= new Scanner(System.in);
		int[] ages = new int[10];
		 
		System.out.print("Enter age for student");
		for (int i=0;i<ages.length;i++) {
			System.out.print("Enter age for student" + (i+1) + "=");
			ages[i] = input.nextInt();
		}
		
		System.out.println("\nVoting Eligibility Results:");
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < 0) {
                System.out.println("Invalid age entered for student " + (i + 1));
            } else if (ages[i] >= 18) {
                System.out.println("The student with age " + ages[i] + " can vote.");
            } else {
                System.out.println("The student with age " + ages[i] + " cannot vote.");
            }
        }

        input.close();
    }
}