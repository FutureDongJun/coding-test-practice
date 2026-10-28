import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int[] Arr = new int[10];
        Arr[0] = sc.nextInt();
        Arr[1] = sc.nextInt();

        for (int i = 2; i < 10; i++) {
            Arr[i] = Arr[i - 2] + Arr[i - 1];

            if (Arr[i] >= 10) {
                Arr[i] = Arr[i] % 10;
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(Arr[i] + " ");
        }
    }
}