public class Queue<T> {
    dynamicArray<T> queue = new dynamicArray<T>();
    int size = 0;

    public void enqueue(T value) {
        queue.add(value);
        size++;
    }

    public void dequeue() {
        queue.remove(0);
        size--;
    }

    public T peek() {
        return queue.get(0);
    }

    public int size() {
        return size;
    }

}
//