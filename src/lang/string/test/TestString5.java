package lang.string.test;

public class TestString5 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";

        int num1 = str.indexOf(ext);
        String fileName = str.substring(0, num1);
        String endName = str.substring(num1, str.length());

        System.out.println("fileName = " + fileName);
        System.out.println("endName = " + endName);


    }
}
