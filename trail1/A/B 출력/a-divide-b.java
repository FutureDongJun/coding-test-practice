import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a / b; //몫
        int d = a % b; // 나머지
        System.out.print(c + ".");

        for (int i = 20; i > 0; i--) {
            d = d * 10;
            a = d;
            c = a / b;
            d = a % b;
            System.out.print(c);
        }
    }
}