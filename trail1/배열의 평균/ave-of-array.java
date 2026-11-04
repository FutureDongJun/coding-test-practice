import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[2][4];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) { // 1. 가로 평균
            int sum = 0;
            double average = 0;
            for (int j = 0; j < 4; j++) {
                sum += arr[i][j];
            }

            average = (double) sum / 4;
            System.out.printf("%.1f", average);
            System.out.print(" ");
        }

        System.out.println();

        for (int i = 0; i < 4; i++) { // 2. 세로 평균
            int sum = 0;
            double average = 0;
            for (int j = 0; j < 2; j++) {
                sum += arr[j][i];
            }

            average = (double) sum / 2;
            System.out.printf("%.1f", average);
            System.out.print(" ");
        }

        System.out.println();

        int sum = 0;
        double average = 0;
        int cnt = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                sum += arr[i][j];
                cnt++;
            }

        }

        average = (double) sum / cnt;
        System.out.printf("%.1f", average);
        System.out.print(" ");
    }
}