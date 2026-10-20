import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int o = n; o > 0; o--) {
            if (o == 1) {
                break;
            }
            for (int i = o; i > 0; i--) {
                System.out.print("* ");
            }
            System.out.println();
        }


        for (int p = 0; p < n; p++) {
            for (int l = 0; l <= p; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}