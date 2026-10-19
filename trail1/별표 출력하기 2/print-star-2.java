import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for (int i = n; i > 0; i--) {
            for (int o = i; o > 0; o--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}