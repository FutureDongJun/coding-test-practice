import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int aAge = sc.nextInt();
        String aSex = sc.next();

        int bAge = sc.nextInt();
        String bSex = sc.next();

        if (aAge >= 19 && aSex.equals("M") || (bAge >= 19 && bSex.equals("M"))) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}