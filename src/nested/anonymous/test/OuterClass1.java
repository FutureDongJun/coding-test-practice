package nested.anonymous.test;

public class OuterClass1 {
    //여기에 NestedClass를 구현하기. hello() 메서드도 만들기

    static class NestedClass {
        public void hello() {
            System.out.println("NestedClass.hello");
        }
    }
}
