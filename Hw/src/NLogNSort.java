import java.util.Arrays;

public class NLogNSort {
    public void MergeSort(int[] data, int L,int R)
    {
        if (R <= L) return;

        int M = (L+R)/2;
        MergeSort(data, L, M);
        MergeSort(data, M+1, R);
        Merge(data, L, M, R);
    }
}