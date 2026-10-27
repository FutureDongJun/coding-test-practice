import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] ints = new int[10];
        int sum = 0;
        int sum3 = 0;
        int cnt = 0;
        for (int i = 0; i < 10; i++) {
            ints[i] = sc.nextInt();

            if ((i + 1) % 2 == 0) {
                sum += ints[i];
            }
        }

        for (int i = 0; i < 10; i++) {
                if ((i + 1) % 3 == 0) {
                    sum3 += ints[i];
                    cnt++;
            }
        }

        System.out.print(sum + " ");
        System.out.printf("%.1f", (double) sum3 / cnt);        
    }
}