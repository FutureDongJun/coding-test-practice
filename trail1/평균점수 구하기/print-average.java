import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        double[] grades = new double[8];
        double sum = 0;

        for (int i = 0; i < 8; i++) {
            grades[i] = sc.nextDouble();
            sum += grades[i];
        }

        System.out.printf("%.1f", sum / 8);
    }
}