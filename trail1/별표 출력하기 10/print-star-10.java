import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;
        int cnt2 = n;
        for (int i = 0; i < n * 2; i++) {

            if (i % 2 == 0) {
                for (int j = 0; j <= cnt; j++) {
                    System.out.print("* ");

                }
                cnt++;
            } else {
                for (int j = cnt2; j > 0; j--) {
                    System.out.print("* ");
                }
                cnt2--;
            }


            System.out.println();
        }
    }
}