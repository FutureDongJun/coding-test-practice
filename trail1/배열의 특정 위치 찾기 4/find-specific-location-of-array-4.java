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

            if (ints[i] == 0) {
                break;
            } else if (ints[i] % 2 == 0 && ints[i] > 0) {
                cnt++;
                sum += ints[i];
            }
        }

        System.out.print(cnt + " " + sum);
    }
}