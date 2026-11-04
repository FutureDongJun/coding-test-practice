import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }



        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j] && maxValue <= arr[j] - arr[i]) {
                    maxValue = arr[j] - arr[i];
                }
            }
        }

        if (maxValue <= 0) {
            System.out.println(0);
        } else {
            System.out.println(maxValue);
        }
    }
}