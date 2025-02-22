import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task5 {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("apple", "ant", "bat", "and", "art", "cat", "axe");

        List<String> filteredWords = getWordsStartingWithAAndLength3(words);

        System.out.println("Words starting with 'a' and having exactly 3 letters: " + filteredWords);
    }
    public static List<String> getWordsStartingWithAAndLength3(List<String> words) {
        return words.stream()
                .filter(word -> word.startsWith("a") && word.length() == 3) // Filter based on conditions
                .collect(Collectors.toList()); // Collect the result into a List
    }
}

