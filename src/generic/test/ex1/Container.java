package generic.test.ex1;

public class Container <T>{

    private T data;
    private boolean empty;

    public void setItem(T data) {
        this.data = data;
    }

    public T getItem() {
        return data;
    }

    public boolean isEmpty() {
        if (data == null) {
            empty = true;
        } else {
            empty = false;
        }

        return empty;
    }
}
