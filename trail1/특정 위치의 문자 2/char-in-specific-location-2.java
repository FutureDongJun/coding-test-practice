import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        char[] chars = new char[10];
        
        for (int i = 0; i < 10; i++) {
            chars[i] = sc.next().charAt(0);
        }
        
        System.out.print(chars[1] + " " + chars[4] + " " + chars[7]);
    }
}