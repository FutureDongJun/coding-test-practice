package boj;

public class var11 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = a+b+c;
        a = d;
        b = d;
        c = d;

        System.out.print(a + " " + b + " " + c);
    }
}
