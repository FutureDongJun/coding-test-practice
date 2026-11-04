import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (arr[i] > maxValue && arr[i] < 500) {
                maxValue = arr[i];
            } else if (arr[i] < minValue && arr[i] > 500) {
                minValue = arr[i];
            }
        }

        System.out.println(maxValue + " " + minValue);
    }
}