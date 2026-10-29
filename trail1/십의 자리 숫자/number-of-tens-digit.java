import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int[] countArr = new int[10];

        for (int i = 0; i < 100; i++) {
            int n = sc.nextInt();

            if (n == 0) {
                break;
            }

            for (int j = 1; j < 10; j++) {
                if (n / 10 == j) {
                    countArr[j]++;
                }
            }
        }

        for (int i = 1; i < 10; i++) {
            System.out.println(i + " - " + countArr[i]);
        }
    }
}