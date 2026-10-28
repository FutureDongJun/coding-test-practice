import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int[] Arr = new int[100];

        for (int i = 0; i < 100; i++) {
            Arr[i] = sc.nextInt();

            if (Arr[i] == 0) {
                break;
            }

            if (Arr[i] % 2 == 1) {
                System.out.print(Arr[i] + 3 + " ");
            } else if (Arr[i] % 2 == 0) {
                System.out.print(Arr[i] / 2 + " ");
            }
        }
    }
}