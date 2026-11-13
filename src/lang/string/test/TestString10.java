package lang.string.test;

public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";

        //코드 작성
        String[] strArr = fruits.split(",");

        for (int i = 0; i < strArr.length; i++) {
            System.out.println(strArr[i]);
        }

        System.out.println("joinedString = " + String.join("->", strArr));
    }
}
