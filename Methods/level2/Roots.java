import java.util.Scanner;

public class Roots {
    public static double[] calcRoots(int a, int b, int c) {
        double[] x = new double[2];
        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta > 0) {
            x[0] = (-b + Math.sqrt(delta)) / (2 * a);
            x[1] = (-b - Math.sqrt(delta)) / (2 * a);
        } else if (delta == 0) {
            x[0] = -b / (2.0 * a);
            x[1] = -b / (2.0 * a);
        } else {
            System.out.println("No real roots.");
            return null;
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 'a' Coeff:");
        int a = input.nextInt(); 
        System.out.println("Enter 'b' Coeff:");
        int b = input.nextInt();
        System.out.println("Enter 'c' Coeff:");
        int c = input.nextInt();

        if (a == 0) {
            System.out.println("'a' cannot be zero.");
        } else {
            double[] rootArr = calcRoots(a, b, c);
            if (rootArr != null) {
                System.out.println("Root1 : " + rootArr[0]);
                System.out.println("Root2 : " + rootArr[1]);
            }
        }

        input.close();
    }
}