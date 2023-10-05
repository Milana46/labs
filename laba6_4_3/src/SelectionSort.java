import java.util.Comparator;

public class SelectionSort<T extends Comparable<? super T>> implements Sort<T> {
    @Override
    public void sort(T[] array, Comparator<T> comp){
        for (int i = 0; i < array.length - 1; ++i) {
            int minPos = i;
            for (int j = i + 1; j < array.length; ++j) {
                if (array[j].compareTo(array[minPos]) < 0) {
                    minPos = j;
                }
            }
            T saveValue = array[minPos];
            array[minPos] = array[i];
            array[i] = saveValue;
        }
    }

}