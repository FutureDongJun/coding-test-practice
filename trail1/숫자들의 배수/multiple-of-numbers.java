import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int cnt = 0;

        int[] Arr = new int[10];
        Arr[0] = sc.nextInt();

        if (Arr[0] % 5 == 0) {
            cnt++;
        }

        for (int i = 0; i < 10; i++) {
            Arr[i] = Arr[0] * (i + 1);

            if (Arr[i] % 5 == 0) {
                System.out.print(Arr[i] + " ");
                cnt++;

                if (cnt > 2) {
                    break;
                }
            } else {
                System.out.print(Arr[i] + " ");
            }
        }
    }
}