import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 1;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    System.out.print(cnt + " ");
                    cnt++;

                    if (j == n - 1) {
                        cnt++;
                    }
                }
            } else {
                for (int j = 0; j < n; j++) {
                    System.out.print(cnt + " ");
                    if (j < n - 1) {
                        cnt += 2;
                    } else {
                        cnt++;
                    }
                }
            }


            System.out.println();
        }
    }
}