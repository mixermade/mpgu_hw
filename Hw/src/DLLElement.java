public class DLLElement <T> {
    DLLElement <T> next;
    DLLElement <T> prev;
    T value;

    public DLLElement(DLLElement Prev, DLLElement Next, T Value) {
        prev = Prev;
        next = Next;
        value = Value;
    }
}