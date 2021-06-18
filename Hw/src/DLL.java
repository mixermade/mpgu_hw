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

    public T getLast() {
        if(last == null){return null;}
        return last.value;
    }

    public T getFirst() {
        if(first == null){return null;}
        return first.value;
    }

    public DLLElement<T> getHead(){
        return first;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insert(DLLElement<T> element, T newElement) {
        DLLElement<T> node = new DLLElement<T>(element, element.next, newElement);
        node.next = element.next;
        node.prev = element;
        if (element == last) addLast(newElement);
        else {
            element.next = node;
            node.next.prev = node;
        }
    }

    public DLLElement<T> search(T searchValue) {
        DLLElement<T> element = first;
        while (element != null) {
            if (element.value.equals(searchValue)) return element;
            element = element.next;
        }
        return null;
    }


    public void delete(DLLElement<T> element) {
        if (element == first) {deleteFirst(); return;}
        if (element == last) {deleteLast(); return;}
        element.next.prev = element.prev;
        element.prev.next = element.next;
    }

    public T deleteFirst() {
        if (first == null) return null;
        T element = first.value;
        if (first == last){
            first = null;
            last = null;}
        else {
            first = first.next;
            first.prev = null;
        }
        return element;
    }

    public T deleteLast() {
        if (last == null) return null;
        T element = last.value;
        if (last == first){
            first = null;
            last = null;}
        else {
            last = last.prev;
            last.next = null;
        }
        return element;
    }


    public T getValue(int number){
        DLLElement<T> element = first;
        int count = 0;
        while (element != null) {
            if (count == number){ return element.value;}
            count++;
            element = element.next;
        }
        return null;
    }

    public DLLElement<T> getElement(int number){
        DLLElement<T> element = first;
        int count = 0;
        while (element != null) {
            if (count == number){ return element;}
            count++;
            element = element.next;
        }
        return null;
    }
}
