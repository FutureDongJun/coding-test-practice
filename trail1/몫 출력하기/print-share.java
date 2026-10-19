import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            
        
            for (int i = 1; i <= 3; i++) {
                int n = sc.nextInt();
                if (n % 2 == 1) {
                    i--;
                } else if (n % 2 == 0) {
                    System.out.println(n / 2);
                }
            }
            break;
        }
    }
}