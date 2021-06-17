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
    @Test
    public void resize_actuallyResized() {
        dynamicArray array = new dynamicArray(10);
        int expected = 5;

        array.resize(expected);

        int actual = array.size();
        assertEquals(expected, actual);
    }
    @Test
    public void setint_actuallyset(){
        dynamicArray array = new dynamicArray(10);
        String expected = "idc";

        array.set(0, expected);

        Object actual = array.get(0);
        assertEquals(expected, actual);
    }
}