import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class StackTests {

    @Test
    public void init_test() {
        Stack<Integer> stack = new Stack<Integer>();
    }

    @Test
    public void getsize_test() {
        Stack<Integer> stack = new Stack<Integer>();
        int expected = 0;

        int actualValue = stack.getSize();
        assertEquals(expected, actualValue);

        stack.push(1);
        expected = 1;
        actualValue = stack.getSize();
        assertEquals(expected, actualValue);
    }

    @Test
    public void push_size_justify() {
        Stack<Integer> stack = new Stack<Integer>();
        int expected = 1;

        stack.push(1);

        int actualValue = stack.getSize();
        assertEquals(expected, actualValue);
    }

    @Test
    public void push_data_justify() {
        Stack<Integer> stack = new Stack<Integer>();
        Object expected = 1;

        stack.push(1);

        Object actualValue = stack.peek();
        assertEquals(expected, actualValue);
    }

    @Test
    public void pop_size_justify() {
        Stack<Integer> stack = new Stack<Integer>();
        int expected = 0;

        stack.push(1);
        stack.pop();

        int actualValue = stack.getSize();
        assertEquals(expected, actualValue);

        stack.push(1);
        stack.push(1);
        stack.push(1);
        stack.pop();
        expected = 2;
        actualValue = stack.getSize();
        assertEquals(expected, actualValue);

        stack.push(1);
        stack.push(1);
        stack.push(1);
        stack.pop();
        stack.pop();
        expected = 3;
        actualValue = stack.getSize();
        assertEquals(expected, actualValue);
    }

    @Test
    public void pop_data_justify() {
        Stack<Integer> stack = new Stack<Integer>();
        Object expected = 1;

        stack.push(1);
        stack.push(2);
        stack.pop();

        Object actualValue = stack.peek();
        assertEquals(expected, actualValue);

        stack.push(111);
        stack.push(222);
        stack.push(333);
        stack.pop();
        expected = 222;
        actualValue = stack.peek();
        assertEquals(expected, actualValue);

        stack.push(444);
        stack.push(555);
        stack.push(666);
        stack.pop();
        stack.pop();
        expected = 444;
        actualValue = stack.peek();
        assertEquals(expected, actualValue);
    }

    @Test
    public void peek_data_test() {
        Stack<Integer> stack = new Stack<Integer>();
        Object expected = 1;

        stack.push(1);

        Object actualValue = stack.peek();
        assertEquals(expected, actualValue);
    }

    @Test
    public void isEmpty_true() {
        Stack<Integer> stack = new Stack<Integer>();
        boolean expected = true;

        boolean actualValue = stack.isEmpty();
        assertEquals(expected, actualValue);
    }

    @Test
    public void isEmpty_false() {
        Stack<Integer> stack = new Stack<Integer>();
        boolean expected = false;

        stack.push(1);

        boolean actualValue = stack.isEmpty();
        assertEquals(expected, actualValue);
    }
}