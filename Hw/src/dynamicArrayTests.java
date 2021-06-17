import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class dynamicArrayTests extends Assertions{
    @Test
    public void init_sizeDefault() {
        dynamicArray array = new dynamicArray();
        int expected = array.starterSize;

        int actual = array.size();
        assertEquals(expected, actual);
    }
}