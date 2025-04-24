import java.util.Scanner;

public class RandomNumberStats {

    public int[] generate4DigitRandomArray(int size) {
        int[] randomNumbers = new int[size];
        int max = 9000;
        int min = 1000;
        int range = max - min + 1;
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = (int) (Math.random() * range) + min;
        }
        return randomNumbers;
    }

    public double[] findAverageMinMax(int[] numbers) {
        int sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int num : numbers) {
            sum += num;
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        double average = (double) sum / numbers.length;
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        RandomNumberStats stats = new RandomNumberStats();
        Scanner scanner = new Scanner(System.in);
        System.out.println("number of random numbers ");
        int n = scanner.nextInt();

        int[] randomNumbers = stats.generate4DigitRandomArray(n);
        System.out.println("Generated Numbers: ");
        for (int i : randomNumbers) {
            System.out.println(i);
        }

        double[] results = stats.findAverageMinMax(randomNumbers);
        System.out.printf("Average: %.2f\n", results[0]);
        System.out.println("Minimum: " + results[1]);
        System.out.println("Maximum: " + results[2]);
        scanner.close();
    }
}