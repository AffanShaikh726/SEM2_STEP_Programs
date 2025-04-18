import java.util.scanner;
public class YoungestAndTallest {
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
        int youngestIndex = 0;
        double tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) youngestIndex = i;
            if (heights[i] > heights[(int)tallestIndex]) tallestIndex = i;
        }
        System.out.println("Youngest friend: " + friends[youngestIndex]);
        System.out.println("Tallest friend: " + friends[(int)tallestIndex]);
        
        sc.close();
    }
}
