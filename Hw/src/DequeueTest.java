import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class DequeueTest extends Assertions {

    @Test
    public void deck_init_sizeTest() {
        Dequeue<Integer> deck = new Dequeue<Integer>();

        int expected = 0;
        int actual = deck.get_size();
        Assertions.assertEquals(expected, actual);
    }


    public void deck_peekFront_ValueTest() {
        Dequeue<Integer> deck = new Dequeue<Integer>();

        deck.add_front(1);

        int expected = 1;
        int actual = deck.peek_front();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void deck_popFront_sizeTest() {
        Dequeue<Integer> deck = new Dequeue<Integer>();

        deck.add_front(1);
        deck.add_front(1);
        deck.pop_front();

        int expected = 1;
        int actual = deck.get_size();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void deck_popFront_ValueTest() {
        Dequeue<Integer> deck = new Dequeue<Integer>();

        deck.add_front(1);
        deck.add_front(2);
        deck.pop_front();

        int expected = 1;
        int actual = deck.peek_front();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void deck_popBack_sizeTest() {
        Dequeue<Integer> deck = new Dequeue<Integer>();

        deck.add_back(1);
        deck.add_back(1);
        deck.pop_back();

        int expected = 1;
        int actual = deck.get_size();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void deck_popBack_ValueTest() {
        Dequeue<Integer> deck = new Dequeue<Integer>();
        deck.add_back(1);
        deck.add_back(2);
        deck.pop_back();

        int expected = 1;
        int actual = deck.peek_back();
        Assertions.assertEquals(expected, actual);
    }
}