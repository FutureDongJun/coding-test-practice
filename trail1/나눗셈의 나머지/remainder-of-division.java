import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr = new int[100];
        int[] arrCnt = new int[b + 1];
        int sum = 0;
        for (int i = 0; i < 100; i++) {

            if (a <= 1) {
                break;
            }

            arr[i] = a % b;

            for (int j = 0; j < b + 1; j++) {
                if (arr[i] == j) {
                    arrCnt[j]++;
                }
            }

            a = a / b;
        }

        for (int i = 0; i < b + 1; i++) {
            if (arrCnt[i] > 0) {
                sum += arrCnt[i] * arrCnt[i];
            }
        }
        System.out.println(sum);
    }
}