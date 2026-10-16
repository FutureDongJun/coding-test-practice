import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int sum = 0;
        int cnt = 0;
        
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            sum += a;
            cnt++;
        }

        System.out.print(sum + " ");
        System.out.printf("%.1f", (double) sum / cnt);
    }
}