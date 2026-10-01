import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int rectangle = n * n;

        if (n < 5) {
            System.out.println(rectangle);
            System.out.println("tiny");
        } else {
            System.out.println(rectangle);
        }
    }
}