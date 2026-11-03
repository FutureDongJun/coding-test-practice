import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

                Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) { // 1. arr 배열 할당
            arr[i] = sc.nextInt();
        }

        int minValue = arr[0];

        for (int i = 0; i < n; i++) { // 2. 최솟값 구하기
            if (minValue > arr[i]) {
                minValue = arr[i];
            }
        }

        // 3. 최솟값 개수 구하기

        int cnt = 0;

        for (int i = 0; i < n; i++) {
            if (minValue == arr[i]) {
                cnt++;
            }
        }

        System.out.println(minValue + " " + cnt);
    }
}