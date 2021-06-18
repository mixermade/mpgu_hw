public class DLL<T>{
    private DLLElement<T> first;
    private DLLElement<T> last;

    public DLL() {
        first =  null;
        last = null;
    }

    public void addFirst(T Value) {
        final DLLElement currFirst = first;
        final DLLElement newDLLElement = new DLLElement(null, currFirst, Value);
        first = newDLLElement;
        if(currFirst == null)
            last = newDLLElement;
        else
            currFirst.prev = newDLLElement;
    }
