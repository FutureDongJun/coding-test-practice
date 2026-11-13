package lang.wrapper.test;


import java.util.Random;

public class LottoGenerator {
    public static void main(String[] args) {
        Random random = new Random();
        int[] lotto = new int[6];

        System.out.print("로또 번호 : ");
        for (int i : lotto) {
            lotto[i] = random.nextInt(45) + 1;

            System.out.print(lotto[i] + " ");
        }

    }
}
