package lang.object.tostring1;

public class Cat {
    private String catName;

    public Cat(String catName) {
        this.catName = catName;
    }

    @Override
    public String toString() {
        return catName + " 긴가민가할 땐 직접 쳐보자";
    }
}
