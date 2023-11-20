import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public final class Symbol implements Printable {
    private static final Map<Character, Symbol> CACHE = new HashMap<>();

    private final Character symbol;

    private Symbol(Character symbol) {
        this.symbol = symbol;
    }

    public static Symbol valueOf(char character) {
        if (CACHE.containsKey(character)) {
            return CACHE.get(character);                                                                       //возвращет соотв обЪект;
        }

        Symbol symbol = new Symbol(character);
        CACHE.put(character, symbol);

        return symbol;
    }

    public static Symbol valueOf(int charInt) {
        return valueOf((char) charInt);
    }

    public Character getSymbol() {
        return symbol;
    }

    @Override
    public String print() {
        return String.valueOf(symbol);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Symbol another = (Symbol) o;
        return Objects.equals(symbol, another.symbol);
    }


    //для перевода обЪекта в int;
    @Override
    public int hashCode() {
        return Objects.hash(symbol);
    }

}
