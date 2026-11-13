package lang.string;

public class StringImmutable1 {

    public static void main(String[] args) {
        String str = "hello";
        str.concat(" java");
        System.out.println("str = " + str);

        String str1 = new String("Hello World");
        str1.concat("!!");
        System.out.println(str1);
    }
}
