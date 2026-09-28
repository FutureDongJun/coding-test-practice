import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        String phoneNumber = sc.next();
        String[] pn = phoneNumber.split("-");

        System.out.println(pn[0] + "-" + pn[2] + "-" + pn[1]);
    }
}