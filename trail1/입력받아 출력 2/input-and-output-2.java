import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        String num = sc.next();

        String[] numSplit = num.split("-");

        for (String s : numSplit) {
            System.out.print(s);
        }
    }
}