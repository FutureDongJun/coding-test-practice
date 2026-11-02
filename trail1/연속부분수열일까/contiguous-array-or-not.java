import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int[] a = new int[n1];
        int[] b = new int[n2];

        for (int i = 0; i < n1; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n2; i++) {
            b[i] = sc.nextInt();
        }

        boolean found = false;

        // B 전체를 비교할 공간이 남아 있는 시작 위치만 검사
        for (int start = 0; start <= n1 - n2; start++) {
            boolean matches = true;

            for (int j = 0; j < n2; j++) {
                if (a[start + j] != b[j]) {
                    matches = false;
                    break;
                }
            }

            // 현재 위치에서 B 전체가 일치하면 탐색 종료
            if (matches) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}