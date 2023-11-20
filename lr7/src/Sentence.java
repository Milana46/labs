

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public final class Sentence implements Printable, Findable {
    private final List<Printable> children;

    public Sentence() {
        this.children = new ArrayList<>();
    }

    public void add(Printable word) {
        children.add(word);
    }

   // public void remove(Printable word) {
      //  children.remove(word);
   // }

    //возвращение слов;
    public List<Word> getWords() {
        return children.stream()
                .filter(x -> x instanceof Word) //проверка пренадлежности к определенному классу
                .map(x -> (Word) x)
                .toList();
    }

    @Override
    public String print() {
        return children.stream()
                .map(Printable::print) //x->Printable.print(x);
                .collect(Collectors.joining());
    }

    @Override
    public boolean find(Word word) {
        return children.contains(word);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sentence another = (Sentence) o;
        return Objects.equals(children, another.children);
    }

    @Override
    public int hashCode() {
        return Objects.hash(children);
    }

}
