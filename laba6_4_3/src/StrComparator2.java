import java.util.Comparator;



public class StrComparator2 implements Comparator<String> {

    @Override
    public int compare(String s1,String s2){
        return (int) (s1.chars().filter(Character::isLowerCase).count() - s2.chars().filter(Character::isLowerCase).count());

    }
}
