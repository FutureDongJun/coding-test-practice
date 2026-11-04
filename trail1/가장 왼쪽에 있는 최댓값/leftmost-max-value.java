import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

                Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int z = 0; z <= 1000; z++) {

            int maxValue = Integer.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                if (maxValue < arr[i]) {
                    maxValue = arr[i];
                }
            }

            int[] arrNew = new int[n + 1];
            int a = 0;

            for (int i = 1; i <= n; i++) {
                if (maxValue == arr[i - 1]) {
                    arrNew[i] = arr[i - 1];
                    System.out.print(i + " ");
                    a = i;
                    break;
                } else {
                    arrNew[i] = arr[i - 1];
                }
            }

            arr = new int[a];

            for (int i = 0; i < a - 1; i++) {
                arr[i] = arrNew[i + 1];
            }

            n = a - 1;

            if(n == 0) {
                break;
            }
        }
    }
}