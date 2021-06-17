public class dynamicArray<T> {
    public T[] array;
    public int starterSize = 0;
    

    public dynamicArray(int size){
        array = (T[])new Object[size];
    }

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
    public void resize(int newSize) {
        T[] newArray= (T[]) new Object[newSize];
        int newLength = newSize;
        if (newSize > array.length) {
            newLength = array.length;
        }
        System.arraycopy(array, 0, newArray, 0, newLength);
        array = newArray;
    }
}
