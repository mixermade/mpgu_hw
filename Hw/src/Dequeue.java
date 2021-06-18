public class Dequeue<T> {
    DLL<T> list = new DLL<T>();

    public void add_front(T value) {
        list.append(value);
    }

    public void add_back(T value) {
        list.push(value);
    }

    public void pop_front() {
        if (list.size-1 < 0) {


            return;
        }

        list.removeNode(list.size - 1);
    }

    public void pop_back() {
        if (list.size-1 < 0) {
            // exceptions preventer

            return;
        }

        list.removeNode(0);
    }


