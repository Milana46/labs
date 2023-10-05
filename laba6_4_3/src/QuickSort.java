import java.util.Comparator;




public class QuickSort<T extends Comparable<? super T>> implements Sort<T>  {

    private int partition(T arr[], int begin, int end, Comparator<T> comp) {
        T pivot = arr[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (arr[j].compareTo(pivot) < 0) {
                i++;

                T swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        T swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        return i+1;
    }

    private void quickImpl(T arr[], int begin, int end, Comparator<T> comp) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end, comp);

            quickImpl(arr, begin, partitionIndex-1, comp);
            quickImpl(arr, partitionIndex+1, end, comp);
        }
    }

    @Override
    public void sort(T[] array, Comparator<T> comp){
        quickImpl(array, 0, array.length - 1, comp);
    }
}