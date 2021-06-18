import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class DLLTest extends Assertions {
    @Test
    public void addGet_addsGets(){
        DLL doubleLinkedList = new DLL();
        doubleLinkedList.addFirst(15);
        doubleLinkedList.addLast(21);
        assertEquals(15, doubleLinkedList.getFirst());
        assertEquals(21, doubleLinkedList.getLast());
    }

    @Test
    public void insertAndSearch_insertsAndSearches(){
        DLL doubleLinkedList = new DLL();
        doubleLinkedList.addFirst(15);
        doubleLinkedList.addLast(21);
        doubleLinkedList.insert(doubleLinkedList.search(21), 26);
        assertEquals(15, doubleLinkedList.getFirst());
        assertEquals(26, doubleLinkedList.getLast());
    }
