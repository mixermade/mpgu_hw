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
    @Test
    public void getSize_sizeCorrect(){
        dynamicArray array2 = new dynamicArray(2);
        int expected = 2;

        int actual = array2.array.length;
        assertEquals(expected, actual);
    }

    @Test
    public void get_getsTheThing(){
        dynamicArray array = new dynamicArray(10);
        String expected ="idc";

        array.set(0, expected);

        Object actual = array.get(0);
        assertEquals(expected, actual);
    }

    @Test
    public void remove_valueRemoved(){
        dynamicArray array = new dynamicArray(10);
        int expected = 4332;

        for (int i=0; i < array.size();i++) {
            array.set(i, expected);
        }
        array.set(4, "empty");
        array.remove(4);

        Object actual = array.get(4);
        assertEquals(expected, actual);
    }
}