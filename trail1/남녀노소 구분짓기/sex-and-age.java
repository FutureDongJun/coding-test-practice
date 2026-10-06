import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int sex = sc.nextInt();
        int age = sc.nextInt();

        if (sex == 1 && age >= 19) {
            System.out.println("WOMAN");
        } else if (sex == 1 && age < 19) {
            System.out.println("GIRL");
        } else if (sex == 0 && age >= 19) {
            System.out.println("MAN");
        } else if (sex == 0 && age < 19) {
            System.out.println("BOY");
        }
    }
}