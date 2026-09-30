import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = a + b;
        double d = a - b;

        double e = Math.round(c / d * 100);
        System.out.printf("%.2f", e / 100);
    }
}