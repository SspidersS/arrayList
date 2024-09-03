public class MyArrayList {
    private static final int INITIAL_CAPACITY = 10;
    private Object[] elements;
    private int size = 0;

    public MyArrayList() {
        elements = new Object[INITIAL_CAPACITY];
    }

    public void add(Object value) {
        if (size == elements.length) {
            increaseCapacity();
        }
        elements[size++] = value;
    }

    public void remove(int index) {
        if (index >= size && index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[--size] = null;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    public int size() {
        return size;
    }

    public Object get(int index) {
        if (index >= size && index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return elements[index];
    }

    private void increaseCapacity() {
        int newCapacity = elements.length * 2;
        Object[] newElements = new Object[newCapacity];
        System.arraycopy(elements, 0, newElements, 0, size);
        elements = newElements;
    }
}