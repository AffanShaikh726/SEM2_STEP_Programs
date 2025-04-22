import java.util.Scanner;
public class YoungestAndTallestM {
		public static int youngest(int [] ages) {
			int youngestIndex = 0;
			for (int i = 1; i < 3; i++) {
				if (ages[i] < ages[youngestIndex]) youngestIndex = i;			
			}
			return youngestIndex;
		}
		
		public static int tallest(double[] heights) {
			int tallestIndex = 0;
			for (int j = 1; j < 3; j++) {
				if (heights[j] > heights[(int)tallestIndex]) tallestIndex = j;
			}
			return tallestIndex;
		}
		
		public static void main(String[] args) {	
			Scanner sc = new Scanner(System.in);
			String[] friends = {"Amar", "Akbar", "Anthony"};
			int[] ages = new int[3];
			double[] heights = new double[3];
			
			for (int i = 0; i < 3; i++) {
				System.out.print("Enter age of " + friends[i] + ": ");
				ages[i] = sc.nextInt();
				System.out.print("Enter height (in cm) of " + friends[i] + ": ");
				heights[i] = sc.nextDouble();
			}
			
			
			
			System.out.println("Youngest friend: " + friends[youngest(ages)]);
			System.out.println("Tallest friend: " + friends[tallest(heights)]);
			
			sc.close();
    }
}
