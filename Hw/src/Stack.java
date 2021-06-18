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

    public T peek() {
        // returns the last item in the stack

        return array.get(size-1);
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}