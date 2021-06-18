public class DLLElement<T> {
    public DLLElement<T> next;
    public DLLElement<T> prev;
    public T data;

    public DLLElement(T value) {
        data = value;
    }
}