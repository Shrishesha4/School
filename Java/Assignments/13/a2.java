import java.util.HashMap;
import java.util.Map;

public class a2 {
    public static void main(String[] args) {
        String input = "abcb";
        Map<Character, Integer> charCount = new HashMap<>();

        for (char c : input.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        System.out.print("Unique characters: ");
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.print(entry.getKey() + " ");
            }
        }
        System.out.print("\n");
    }
}
