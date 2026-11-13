package lang.wrapper.test;

public class WrapperTest2 {
    public static void main(String[] args) {
        String[] array = {"1.5", "2.5", "3.0"};

        double sumDouble = 0;
        double parseDouble;

        for (int i = 0; i < array.length; i++) {
            parseDouble = Double.parseDouble(array[i]);
            sumDouble += parseDouble;
        }

        System.out.println("sum = " + sumDouble);

    }
}
