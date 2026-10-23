import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 1;
        int cnt2 = n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j % 2 == 0) {
                    System.out.print(cnt);
                } else {
                    System.out.print(cnt2);
                }
            }
            cnt++;
            cnt2--;
            System.out.println();
        }
    }
}