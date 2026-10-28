import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] Arr = new int[n];
        int[] evenArr = new int[n];
        int cnt = 0;


        for (int i = 0; i < n; i++) {
            Arr[i] = sc.nextInt();

            if (Arr[i] % 2 == 0) {
                evenArr[cnt] = Arr[i];
                cnt++;
            }
        }

        for (int i = 0; i < cnt; i++) {
            System.out.print(evenArr[i] + " ");
        }
    }
}