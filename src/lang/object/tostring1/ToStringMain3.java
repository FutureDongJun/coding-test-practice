package lang.object.tostring1;

public class ToStringMain3 {
    public static void main(String[] args) {
        Object obj = new Object();
        Bread bread = new Bread("크림빵");
        Cat cat = new Cat("스핑크스고양이");

        Object objects[] = {bread, cat};

        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }

    }

}
