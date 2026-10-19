import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int cnt = 0;
        int sum = 0;
        while (true) {
            int age = sc.nextInt();

            if (age >= 30 || age < 20) {
                System.out.printf("%.2f", (double)sum / cnt);
                break;
            } else {
                sum += age;
            }

            cnt++;
        }
    }
}