public class dynamicArray<T> {
    private T[] array;
    public int starterSize = 0;

    public dynamicArray(){
        array = (T[])new Object[starterSize];
    }
    public T get(int count){
        return array[count];
    }
    public void set(int count,T value){
        array[count] = value;
    }
    public int size(){
        return array.length;
    }
}
