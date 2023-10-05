import java.util.ArrayList;
import java.util.Comparator;

public class MaxiSorter {
    private static MaxiSorter instance;

    public static MaxiSorter getInstance() {
        if (instance == null) {
            instance = new MaxiSorter();
        }
        return instance;
    }

    public static void sort(ArrayList<Pribor> pribors){
        pribors.sort(Comparator.comparing(Pribor::getP));
    }
}
