import java.util.Arrays;

public class NLogNSort {
    public void MergeSort(int[] data, int L, int R)
    {
        if (R <= L) return;

        int M = (L+R)/2;
        MergeSort(data, L, M);
        MergeSort(data, M+1, R);
        Merge(data, L, M, R);
    }
    public static void Merge(int[] data, int L, int M, int R) {
        int Left[] = new int[M - L + 1];
        int Right[]= new int[R - M];
        for (int i = 0; i < Left.length; i++)
            Left[i] = data[L + i];
        for (int i = 0; i < Right.length; i++)
            Right[i] = data[M + i + 1];
        int leftIndex = 0;
        int rightIndex = 0;

        for (int i = L; i < R + 1; i++) {

            if (leftIndex < Left.length && rightIndex < Right.length) {
                if (Left[leftIndex] < Right[rightIndex]) {
                    data[i] = Left[leftIndex];
                    leftIndex++;
                } else {
                    data[i] = Right[rightIndex];
                    rightIndex++;
                }
            } else if (leftIndex < Left.length) {

                data[i] = Left[leftIndex];
                leftIndex++;
            } else if (rightIndex < Right.length) {

                data[i] = Right[rightIndex];
                rightIndex++;
            }
        }
    }
}