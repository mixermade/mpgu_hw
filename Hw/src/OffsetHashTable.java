import java.util.ArrayList;
import java.util.Objects;

class HashNode<K, V> {
    K key;
    V value;
    final int hashCode;


    HashNode<K, V> next;


    public HashNode(K key, V value, int hashCode) {
        this.key = key;
        this.value = value;
        this.hashCode = hashCode;
    }
}

public class OffsetHashTable<K, V> {
    private ArrayList<HashNode<K, V> > array;


    private int numBuckets;


    private int size;

    public OffsetHashTable() {
        array = new ArrayList<>();
        numBuckets = 10;
        size = 0;


        for (int i = 0; i < numBuckets; i++)
            array.add(null);
    }

    public int size() { return size; }

    public boolean isEmpty() { return size() == 0; }

    private final int hashCode (K key) {
        return Objects.hashCode(key);
    }
