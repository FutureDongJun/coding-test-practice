import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int power = 1;
        
        for (int i = 1; i <= 10; i++) {
            power *= i;
            
            if (power >= n) {
                System.out.println(i);
                break;
            }
        }
    }
}