import java.util.ArrayList;
import java.util.List;

public class CompoundFindable implements Findable {
    private final List<Findable> children;

    public CompoundFindable() {
        this.children = new ArrayList<>();
    }

    public void add(Findable findable) {
        children.add(findable);
    }

    public <T extends Findable> void add(List<T> findableList) {
        children.addAll(findableList);
    }

   // public void remove(Findable findable) {
     //   children.remove(findable);
    //}

    @Override
    public boolean find(Word word) {
        return children.stream().anyMatch(sentence -> sentence.find(word));
    }

}



