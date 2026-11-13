package boj;

public class StudyString {
    public static void main(String[] args) {

        String a = "qwert";
        System.out.println(a.length());

        System.out.println(a.charAt(0));
        System.out.println(a.substring(0, 3));
        System.out.println(a.indexOf("e"));
        System.out.println(a.toUpperCase());
        System.out.println(a.substring(0,3).toUpperCase());
        System.out.println(a.concat("r"));

    }
}
