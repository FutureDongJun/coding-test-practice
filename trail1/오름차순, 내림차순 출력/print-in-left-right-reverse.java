import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 1;
        int cnt2 = n;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    if (cnt == n + 1) {
                        cnt = 1;
                    }
                    System.out.print(cnt);
                    cnt++;
                }
            } else {
                for (int j = 0; j < n; j++) {
                    if (cnt2 == 0) {
                        cnt2 = n;
                    }
                    System.out.print(cnt2);
                    cnt2--;
                }
            }
            System.out.println();
        }
    }
}