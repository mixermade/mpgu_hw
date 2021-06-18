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


