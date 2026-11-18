package collection.array;

import java.util.Arrays;

public class MyArrayListV1 {

    private static final int DEFAULT_CAPACITY = 5; //배열의 기본 크기 선언

    private Object[] elementData; // Object 타입의 배열이 들어갈 수 있는 변수 선언
    private int size = 0; // 배열의 size 변수 선언

    public MyArrayListV1() { //생성자, 기본 크기가 5인 배열 생성자
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV1(int initialCapacity) { //생성자, 기본 크기를 선언할 수 있는 배열 생성자
        elementData = new Object[initialCapacity];
    }

    public int size() { // 배열의 size 반환
        return size;
    }

    public void add(Object e) { // 배열의 0번째부터 객체 변수 선언
        elementData[size] = e;
        size++; // 후위 증감 연산
    }

    public Object get(int index) { // 배열의 index번째 변수 반환
        return elementData[index];
    }

    public Object set(int index, Object element) { // 배열의 index번째 변수를 선언하고 과거의 변수 반환
        Object oldValue = get(index);
        elementData[index] = element;
        return oldValue;
    }

    public int indexOf(Object o) { // 배열에 들어있는 변수를 탐색하는 기능
        for (int i = 0; i < size; i++) {
            if (o.equals(elementData[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elementData, size)) + " size=" + size +
                ", capacity=" + elementData.length;
    }
}
