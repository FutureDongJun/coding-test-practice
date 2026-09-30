import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int width = sc.nextInt() + 8;
        int height = sc.nextInt() * 3;

        System.out.println(width);
        System.out.println(height);
        System.out.println(width * height);
    }
}