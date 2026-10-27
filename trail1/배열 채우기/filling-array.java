import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int[] ints = new int[10];
        int a = 0;
        for (int i = 0; i < 10; i++) {
            ints[i] = sc.nextInt();

            if (ints[i] == 0) {
                a = i;
                break;
            } else {
                a = 10;
            }
        }

        for (int i = a - 1; i >= 0; i--) {
            System.out.print(ints[i] + " ");
        }
    }
}