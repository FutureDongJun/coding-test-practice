import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] Arr = new int[100];

        Arr[0] = 1;
        Arr[1] = n;
        int cnt = 2;

        for (int i = 2; i < 100; i++) {
            Arr[i] = Arr[i - 1] + Arr[i - 2];
            cnt++;

            if (Arr[i] > 100) {
                break;
            }
        }

        int[] Arr2 = new int[cnt];

        for (int i = 0; i < cnt; i++) {
            Arr2[i] = Arr[i];
            System.out.print(Arr2[i] + " ");
        }
    }
}