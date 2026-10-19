import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        while (true) {
            int width = sc.nextInt();
            int height = sc.nextInt();
            String c = sc.next();
            if (c.equals("C")) {
                System.out.println(width * height);
                break;
            } else {
                System.out.println(width * height);
                continue;
            }
        }
    }
}