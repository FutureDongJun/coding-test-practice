import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        
        int[] ints = new int[10];

        for (int i = 0; i < 10; i++) {
            ints[i] = sc.nextInt();
        }

        int sum = ints[2] + ints[4] + ints[9];

        System.out.println(sum);
    }
}