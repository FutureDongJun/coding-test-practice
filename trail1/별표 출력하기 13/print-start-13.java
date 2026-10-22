import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;
        int cnt2 = n;
        for (int i = 0; i < 2 * n; i++) {
            if (i % 2 == 0) {
                for (int j = n; j > cnt; j--){
                    System.out.print("* ");
                }
                cnt++;
            } else if (i % 2 == 1){
                for (int j = n - cnt2; j >= 0 ; j--) {
                    System.out.print("* ");
                }
                cnt2--;
            }

            System.out.println();
        }
    }
}