import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        int maxValue = arr[0];

        for (int i = 0; i < 10; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }

        System.out.println(maxValue);
    }
}