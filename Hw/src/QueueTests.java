public class QueueTests {
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QueueTests extends Assertions {

    @Test
    public void enqueue_check_data() {
        Queue<Integer> queue = new Queue<Integer>();
        int expected = 10;

        queue.enqueue(10);

        int actual = queue.peek();
        assertEquals(expected, actual);

        expected = 10;
        queue.enqueue(20);
        actual = queue.peek();
        assertEquals(expected, actual);
    }

    @Test
    public void enqueue_check_size() {
        Queue<Integer> queue = new Queue<Integer>();
        int expected = 1;

        queue.enqueue(10);

        int actual = queue.size();
        assertEquals(expected, actual);

        expected = 2;
        queue.enqueue(20);
        actual = queue.size();
        assertEquals(expected, actual);
    }

    @Test
    public void dequeue_check_data() {
        Queue<Integer> queue = new Queue<Integer>();
        int expected = 20;

        queue.enqueue(10);
        queue.enqueue(20);
        queue.dequeue();

        int actual = queue.peek();
        assertEquals(expected, actual);

        expected = 20;
        actual = queue.peek();
        assertEquals(expected, actual);
    }

    @Test
    public void dequeue_check_size() {
        Queue<Integer> queue = new Queue<Integer>();
        int expected = 1;

        queue.enqueue(3);
        queue.enqueue(3);

        queue.dequeue();

        int actual = queue.size();
        assertEquals(expected, actual);

        expected = 0;
        queue.dequeue();
        actual = queue.size();
        assertEquals(expected, actual);
    }

}
