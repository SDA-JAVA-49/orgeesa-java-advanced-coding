import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task6 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 44, 15, 28, 7);

        String result = getEvenOddPrefixedString(numbers);

        System.out.println("Comma-separated string: " + result);
    }

    public static String getEvenOddPrefixedString(List<Integer> numbers) {
        return numbers.stream()
                .map(num -> (num % 2 == 0 ? "e" : "o") + num)  // Prefix 'e' for even and 'o' for odd
                .collect(Collectors.joining(","));  // Join the results with commas
    }
}
