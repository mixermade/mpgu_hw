public class dynamicArray<T> {
    public T[] array;
    public int starterSize = 0;
    
    private T[] count;

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
    public void add(T value) {
        resize(array.length + 1);
        array[array.length - 1] = value;
    }
    public void insert(int index, T value) {
        T[] newArray;
        newArray = (T[]) new Object[array.length + 1];
        for (int i = 0; i < index; i++) {
            newArray[i] = get(i);
        }
        newArray[index] = value;
        for (int i = index+1; i < newArray.length; i++) {
            newArray[i] = get(i-1);
        }
        this.array = newArray;
    }
    public int findFirst(T value){
        for(int i = 0; i < size(); i++){
            if(array[i] == value){
                return i;
            }
        }
        return -1;
    }

    public int findLast(T value){
        for(int i = size() - 1; i > -1; i--){
            if(array[i] == value){
                return i;
            }
        }
        return -1;
    }
    public void remove(int index){
        array[index] = null;
        if (size() - 1 - index >= 0) System.arraycopy(array, index + 1, array, index, size() - 1 - index);
    }
    }

