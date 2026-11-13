package lang.string;

public class StringImmutable2 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = str1.concat(" java");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);

        System.out.println(str1.concat("김치찌개맛있겠다"));

        System.out.println(str1.length());
        System.out.println(str1.isEmpty());
        System.out.println(str1.isBlank());
        System.out.println(str1.charAt(2));
        System.out.println(str1.equals(str2));
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.startsWith("h"));
        System.out.println(str1.endsWith("o"));
        System.out.println(str1.contains("l"));
        System.out.println(str1.indexOf("e"));
    }
}
