

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Sentence> sentences = FileReaderUtil.readFile("test.txt");

        sentences.stream()
                .map(Sentence::print)
                .forEach(System.out::println);

        Sentence firstSentence = sentences.get(0);
        sentences.remove(0);  // нет смысла таскать его с собой ;

        CompoundFindable compoundFindable = new CompoundFindable();
        compoundFindable.add(sentences);

        List<Word> uniqueWordsInFirstSentence = firstSentence.getWords().stream()
                .filter(word -> !compoundFindable.find(word))
                .toList();

        System.out.println(uniqueWordsInFirstSentence);
    }
}


