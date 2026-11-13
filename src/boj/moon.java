package boj;

public class moon {
    public static void main(String[] args) {
        int weight = 13;
        double ratio = 0.165;

        System.out.printf(weight + " * ");
        System.out.printf("%.6f", ratio);
        System.out.printf(" = %.6f", weight * ratio);
    }
}
