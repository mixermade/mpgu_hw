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

    private int getIndex(K key) {
        int hashCode = hashCode(key);
        int index = hashCode % numBuckets;
        // key.hashCode() coule be negative.
        index = index < 0 ? index * -1 : index;
        return index;
    }

    public V delete(K key) {
        int bucketIndex = getIndex(key);
        int hashCode = hashCode(key);

        HashNode<K, V> head = array.get(bucketIndex);
        HashNode<K, V> prev = null;

        while (head != null) {
            if (head.key.equals(key) && hashCode == head.hashCode)
                break;

            prev = head;
            head = head.next;
        }
        if (head == null)
            return null;
        size--;

        if (prev != null)
            prev.next = head.next;
        else
            array.set(bucketIndex, head.next);
        return head.value;
    }

    public V get(K key) {
        int bucketIndex = getIndex(key);
        int hashCode = hashCode(key);

        HashNode<K, V> head = array.get(bucketIndex);

        while (head != null) {
            if (head.key.equals(key) && head.hashCode == hashCode)
                return head.value;
            head = head.next;
        }
        return null;
    }

    public void insert(K key, V value) {
        int bucketIndex = getIndex(key);
        int hashCode = hashCode(key);
        HashNode<K, V> head = array.get(bucketIndex);

        while (head != null) {
            if (head.key.equals(key) && head.hashCode == hashCode) {
                head.value = value;
                return;
            }
            head = head.next;
        }
        size++;
        head = array.get(bucketIndex);
        HashNode<K, V> newNode
                = new HashNode<K, V>(key, value, hashCode);
        newNode.next = head;
        array.set(bucketIndex, newNode);
    }
}