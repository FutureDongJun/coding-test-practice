import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);
        int[] gradeArr = new int[11];

        for (int i = 0; i < 100; i++) {
            int n = sc.nextInt();

            if (n == 0) {
                break;
            }

            if (n < 10) {
                continue;
            }

            for (int j = 1; j < 11; j++) {
                if (n / 10 == j) {
                    gradeArr[j]++;
                }
            }
        }

        for (int i = 10; i > 0; i--) {
            System.out.println((i * 10) + " - " + gradeArr[i]);
        }
    }
}