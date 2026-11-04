import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }

        int[] arrCnt = new int[1001];

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < 1001; j++) {
                if (arr[i] == j) {
                    arrCnt[j]++;
                }
            }
        }

        int maxValue = -1;

        if (arr.length != 1) {
            for (int i = 1; i <= 1000; i++) {
                if (arrCnt[i] == 1) {
                    if (maxValue < i) {
                        maxValue = i;
                    }
                }
            }
        } else {
            maxValue = arr[0];
        }



        System.out.println(maxValue);
    }
}