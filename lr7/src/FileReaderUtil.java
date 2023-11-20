import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class FileReaderUtil {

    private FileReaderUtil() {
    }

    public static List<Sentence> readFile(File file) {
        List<Sentence> sentences = new ArrayList<>();
        StringBuilder text = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                text.append(line).append(" ");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String[] splitBySentences = text.toString().split("(?<=[a-z])\\.\\s+"); //для всего того, что ограничено пробелами;
        for (String stringSentence : splitBySentences) {
            sentences.add(buildSentence(stringSentence));
        }

        return sentences;
    }

    public static List<Sentence> readFile(String fineName) {
        return readFile(new File(fineName));
    }

    private static Sentence buildSentence(String stringSentence) {
        Sentence sentence = new Sentence();
        String[] words = stringSentence.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (i == words.length - 1) {
                sentence.add(Word.valueOf(words[i]));
                sentence.add(Symbol.valueOf('.'));
                break;
            }
            sentence.add(Word.valueOf(words[i]));//на слова
            sentence.add(Symbol.valueOf(' '));//на символы;
        }

        return sentence;
    }

}
