import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

                Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();

        int[] arr = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < q; i++) {
            int m = sc.nextInt();

            if (m == 1) { // 1번 질의
                int o = sc.nextInt();
                System.out.println(arr[o]);
            }

            if (m == 2) { // 2번 질의
                int o = sc.nextInt();
                int cnt = 0;
                for (int j = 1; j <= n; j++) {
                    if (arr[j] == o) {
                        System.out.println(j);
                        cnt++;
                        break;
                    }
                }

                if (cnt == 0) {
                    System.out.println(0);
                }
            }

            if (m == 3) { // 3번 질의
                int o = sc.nextInt();
                int p = sc.nextInt();

                for (int j = o; j <= p; j++) {
                    System.out.print(arr[j] + " ");
                }
                System.out.println();

            }
        }
    }
}