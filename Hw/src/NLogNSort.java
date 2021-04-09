import java.util.Arrays;

public class NLogNSort {
    public void MergeSort(int[] data, int low, int high)
    {
        if (high <= low) return;

        int mid = (low+high)/2;
        MergeSort(data, low, mid);
        MergeSort(data, mid+1, high);
    }


}