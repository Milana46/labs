import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public final class Word implements Printable {
    private final List<Symbol> symbols;

    private Word(List<Symbol> symbols) {
        this.symbols = symbols;
    }

    public static Word valueOf(String word) {
        List<Symbol> symbols = word.chars()
                .boxed()    //стрим символов в стрим обЪектов для мэпа!!!
                .map(Symbol::valueOf)
                .toList();
        return new Word(symbols);
    }

    public String getWord() {
        return symbols.stream()
                .map(symbol -> String.valueOf(symbol.getSymbol()))//для вывода всего предложения вместе
                .collect(Collectors.joining());
    }

    public List<Symbol> getSymbols() {
        return new ArrayList<>(symbols);
    }

    @Override
    public String print() {
        return getWord();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Word another = (Word) o;
        return Objects.equals(symbols, another.symbols);
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbols);
    }

    @Override
    public String toString() {
        return print();
    }   //для вывода в консоль
}
