import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        String date = sc.next();

        String[] dateInput = date.split("\\.");

        String month = dateInput[1];
        String day = dateInput[2];
        String year = dateInput[0];

        System.out.print(month + "-" + day + "-" + year);
        

        //이 방식이 맘에 안들긴한데,, 일단 억지로 이런 식으로라도 풀어보자 ㅠㅠ
    }
}