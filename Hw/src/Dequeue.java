public class Dequeue<T> {
    DLL<T> list = new DLL<T>();

    public void add_front(T value) {
        list.append(value);
    }

    public void add_back(T value) {
        list.push(value);
    }
