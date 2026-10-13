import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int cntRoom = 0;
        int cntHallway = 0;
        int cntRestroom = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 12 == 0) {
                cntRestroom++;
            } else if (i % 3 == 0) {
                cntHallway++;
            } else if (i % 2 == 0) {
                cntRoom++;
            }
        }

        System.out.print(cntRoom + " " + cntHallway + " " + cntRestroom);
    }
}