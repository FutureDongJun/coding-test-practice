import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

                Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] Arr = new int[n];

        for (int i = 0; i < n; i++) {
            Arr[i] = sc.nextInt();

            if (Arr[i] % 2 == 0) {
                System.out.print(Arr[i] + " ");
            }
        }
    }
}