import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i < n; i++) {
            for (int o = 1; o <= i; o++) {
                System.out.print("*");
            }
            System.out.println();
            System.out.println();
        }

        for (int z = 0; z < n; z++) {
            System.out.print("*");
        }

        System.out.println();
        System.out.println();

        for (int p = n; p > 1; p--) {
            for (int l = p; l > 1; l--) {
                System.out.print("*");
            }
            System.out.println();
            System.out.println();
        }
    }
}