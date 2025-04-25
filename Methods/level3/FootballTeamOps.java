import java.util.Scanner;

public class FootballTeamOps {
    public static int sum(int[] heightArr) {
        int sum = 0;
        for (int j = 0;j < heightArr.length;j++) {
            sum += heightArr[j];
        }
        return sum;
	}

    public static int mean(int[] heightArr) {
        return (int) sum(heightArr)/heightArr.length;
	}

    public static int shortestHeight(int[] array) {
        int minValue = array[0];
        for (int i = 0; i < array.length; i++) {

            if(array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
	}

    public static int tallestHeight(int[] array) {
        int maxValue = array[0];
        for (int i = 0; i < array.length; i++) {
            

            if(array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
	}

    public static void main(String[] args){
        int size = 11;
        int heights[] = new int[size];
        System.out.println("The heights of players(in cm)");

        int max = 250;
        int min = 150;
        int range = max - min + 1;

        for (int i = 0;i < heights.length;i++) {
            heights[i] = (int) (Math.random() * range) + min;
            System.out.println((i+1) + ": " + heights[i]);
        }

        System.out.println("Sum of heights of players : " + sum(heights));
        System.out.println("Mean height of players : " + mean(heights));
        System.out.println("Shortest height of players : " + shortestHeight(heights));
        System.out.println("Tallest height of players : " + tallestHeight(heights));

	}
}
