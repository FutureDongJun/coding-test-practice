import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int[] ints = new int[10];
        int sumOdd = 0;
        int sumEven = 0;

        for (int i = 0; i < 10; i++) {
            ints[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                sumOdd += ints[i];
            } else {
                sumEven += ints[i];
            }
        }

        if (sumOdd > sumEven) {
            System.out.println(sumOdd - sumEven);
        } else {
            System.out.println(sumEven - sumOdd);
        }
    }
}