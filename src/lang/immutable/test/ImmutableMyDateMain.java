package lang.immutable.test;

public class ImmutableMyDateMain {
    public static void main(String[] args) {
        ImmutableMyDate date1 = new ImmutableMyDate(2024, 1, 1);
        ImmutableMyDate date2 = date1;
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);

        System.out.println("수정 이후");
        date2 = date1.setDate(2025, 1, 1);
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);

    }
}
