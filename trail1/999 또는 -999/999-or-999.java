import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        int cnt = 0;

        for (int i = 0; i < 100; i++) {
            arr[i] = sc.nextInt();


            if (arr[i] == 999 || arr[i] == -999) {
                break;
            }

            cnt++;
        }

        int maxValue = arr[0];
        int minValue = arr[0];

        for (int i = 0 ; i < cnt; i++) {
            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }

            if (minValue > arr[i]) {
                minValue = arr[i];
            }
        }
        
        System.out.println(maxValue + " " + minValue);
    }
}