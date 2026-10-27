import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] grade = new int[4];
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;

            for (int j = 0; j < 4; j++) {
                grade[j] = sc.nextInt();
                sum += grade[j];
            }

            if (sum / 4 >= 60) {
                System.out.println("pass");
                cnt++;
            } else {
                System.out.println("fail");
            }
        }
        System.out.println(cnt);
    }
}