import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 'A';

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i > j) {
                    System.out.print("  ");
                } else {
                    System.out.print((char) cnt + " ");
                    if (cnt == 'Z') {
                        cnt = 'A';
                    } else {
                        cnt++;
                    }
                }
            }

            System.out.println();
        }
        }
    }
