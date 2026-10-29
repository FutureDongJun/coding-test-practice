import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int[] countArr = new int[7];

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();

            for (int j = 1; j < 7; j++) {
                if (arr[i] == j) {
                    countArr[j]++;
                }
            }
        }

        for (int i = 1; i <= 6; i++) {
            System.out.println(i + " - " + countArr[i]);
        }
    }
}