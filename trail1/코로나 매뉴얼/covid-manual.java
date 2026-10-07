import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        

                Scanner sc = new Scanner(System.in);

        String cold = sc.next();
        int temp = sc.nextInt();

        String cold1 = sc.next();
        int temp1 = sc.nextInt();

        String cold2 = sc.next();
        int temp2 = sc.nextInt();

        int count = 0;

        if (cold.equals("Y")) {
            if (temp >= 37){
                count++;
            }
        }

        if (cold1.equals("Y")) {
            if (temp1 >= 37){
                count++;
            }
        }

        if (cold2.equals("Y")) {
            if (temp2 >= 37){
                count++;
            }
        }

        if (count >= 2) {
            System.out.println("E");
        } else {
            System.out.println("N");
        }
        
    }
}