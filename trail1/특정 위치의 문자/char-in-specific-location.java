import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

                Scanner sc = new Scanner(System.in);

        char[] chars = new char[] {'L', 'E', 'B', 'R', 'O', 'S'};

        char e = sc.next().charAt(0);
        boolean bool = false;

        for (int i = 0; i < 6; i++) {
            if (chars[i] == e) {
                System.out.println(i);
                bool = true;
                break;
            }
        }

        if (!bool) {
            System.out.println("None");
        }
    }
}