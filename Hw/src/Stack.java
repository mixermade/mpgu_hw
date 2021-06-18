public class Stack<T> {
    int size = 0;
    dynamicArray<T> array = new dynamicArray<T>(size);

    public void push(T data) {
        array.add(data);
        size++;
    }

    public void pop() {
        array.resize(size-1);
        size--;
    }

