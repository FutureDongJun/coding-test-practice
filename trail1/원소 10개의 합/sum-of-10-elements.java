import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);
        int[] ints = new int[10];
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            ints[i] = sc.nextInt();
            sum += ints[i];
        }

        System.out.println(sum);
    }
}