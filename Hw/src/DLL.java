public class DLL<T> {
    public DLLElement<T> head;
    public DLLElement<T> tail;
    public int size = 0;

    public static String notFoundError = "entity not found";
    public static String outOfRangeError = "entity is out of range";

    public void printAll() {
        DLLElement<T> traverse = head;

        while (traverse != null) {
            System.out.println(traverse.data);
            traverse = traverse.next;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean notEmpty() {
        return head != null;
    }

    public void push(T data) {
        DLLElement<T> newNode = new DLLElement<>(data);
        size++;

        newNode.prev = null;
        newNode.next = head;

        if (isEmpty()) {
            // if the list is empty

            head = newNode;
            tail = newNode;
            return;
        }

        head.prev = newNode;
        head = newNode;
    }

    public void append(T data) {
        DLLElement<T> newNode = new DLLElement<>(data);

        if (tail == null) {
            newNode.next = null;
            newNode.prev = null;
            head = newNode;
            tail = newNode;
            size++;
            return;
        }

        tail.next = newNode;
        newNode.next = null;
        newNode.prev = tail;
        tail = newNode;
        size++;
    }

    public void removeNode(int id) {
        DLLElement<T> temp = head;
        temp.next = head.next;
        int counter = 0;

        while (temp.next != null && counter != id) {
            temp = temp.next;
            counter++;
        }

        if (counter == id) {

            if (temp.prev == null) {
                head = temp.next;

                if (this.head == null) {
                    return;
                }

                if (head.prev != null) {
                    head.prev = null;
                }
                size--;
                return;
            }

            if (temp.next == null) {

                tail = temp.prev;
                tail.next = null;
                size--;
                return;
            }

            DLLElement<T> prevNode = temp.prev;
            DLLElement<T> nextNode = temp.next;
            nextNode.prev = prevNode;
            prevNode.next = nextNode;
            size--;
            return;
        }

        throw new IllegalArgumentException(outOfRangeError);
    }

    public T getValueByIndex(int index) {

        if (index < 0 || index >= size) {
            throw new RuntimeException(outOfRangeError);
        }


        DLLElement<T> traverse = head;

        int iteratorIndex = 0;

        while (iteratorIndex != index && traverse.next != null) {
            traverse = traverse.next;
            iteratorIndex++;
        }

        if (traverse != null) {
            return traverse.data;
        }

        throw new RuntimeException(notFoundError);
    }

    public DLLElement<T> getNodeIndex(int index) {

        if (index < 0 || index >= size) {
            throw new RuntimeException(outOfRangeError);
        }

        DLLElement<T> traverse = head;

        int iteratorIndex = 0;

        while (iteratorIndex != index && traverse.next != null) {
            traverse = traverse.next;
            iteratorIndex++;
        }

        if (traverse != null) {
            return traverse;
        }

        throw new RuntimeException(notFoundError);
    }

    public void setValueIndex(int index, T data) {

        if (index < 0 || index >= size) {
            throw new RuntimeException(outOfRangeError);
        }

        DLLElement<T> traverse = head;

        int iteratorIndex = 0;

        while (iteratorIndex != index && traverse.next != null) {
            traverse = traverse.next;
            iteratorIndex++;
        }

        if (traverse != null) {
            traverse.data = data;
            return;
        }

        throw new RuntimeException(notFoundError);
    }

    public DLLElement<T> findNodeFirst(Object value) {
        DLLElement<T> traverse = head;

        while (traverse != null) {

            if (traverse.data.equals(value)) {
                return traverse;
            }

            traverse = traverse.next;
        }

        throw new RuntimeException(notFoundError);
    }


    public void insertAfter(DLLElement<T> node, T value) {
        DLLElement<T> newNode = new DLLElement<>(value);

        newNode.next = node.next;
        node.next=newNode;
        newNode.prev=node;

        if (newNode.next != null) {
            // if the node is to be inserted after last node

            newNode.next.prev = newNode;
        } else {
            tail = newNode;
        }
    }

    public void insertBefore(DLLElement<T> node, T value) {
        DLLElement<T> newNode = new DLLElement<>(value);

        if (node == head) {
            // if the node is to be inserted before head

            newNode.prev = null;
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            return;
        }

        newNode.prev = node.prev;
        newNode.next = node;
        node.prev.next = newNode;
        node.prev = newNode;
    }

    private void removeNodeHead() {
        head = head.next;
        head.prev = null;
        size--;
    }

    private void removeNodeTail() {
        head = head.prev;
        head.next = null;
        size--;
    }

    public void removeFirstNodeValue(T value) {
        DLLElement<T> traverse = head;

        while (traverse != null) {

            if (traverse.data.equals(value)) {

                if (traverse.prev == null) {
                    removeNodeHead();
                    return;
                }

                if (traverse.next == null) {
                    removeNodeTail();
                    return;
                }

                traverse.prev.next = traverse.next;
                size--;
                return;
            }

            traverse = traverse.next;
        }

        throw new RuntimeException(notFoundError);
    }
}
