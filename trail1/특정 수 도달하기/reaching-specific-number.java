import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] ints = new int[10];
        int cnt = 0;
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            ints[i] = sc.nextInt();

            if (ints[i] < 250) {
                cnt++;
                sum += ints[i];
            } else {
                break;
            }
        }

        System.out.print(sum + " ");
        System.out.printf("%.1f", (double) sum / cnt);
    }
}