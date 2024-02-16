import java.util.HashMap;
import java.util.Map;

public class MaxSubstringFrequency {

    public static void main(String[] args) {
        String inputString = "your_input_string_here";
        int minLength = 2; // minimum length of substring
        int maxLength = 4; // maximum length of substring
        int maxUnique = 3; // maximum number of unique characters in substring

        Map<String, Integer> substringFrequencyMap = new HashMap<>();

        for (int i = 0; i <= inputString.length() - minLength; i++) {
            for (int j = i + minLength; j <= Math.min(i + maxLength, inputString.length()); j++) {
                String substring = inputString.substring(i, j);

                if (isSubstringValid(substring, maxUnique)) {
                    substringFrequencyMap.put(substring, substringFrequencyMap.getOrDefault(substring, 0) + 1);
                }
            }
        }

        // Find the maximum occurring substring and its frequency
        String maxSubstring = "";
        int maxFrequency = 0;

        for (Map.Entry<String, Integer> entry : substringFrequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxSubstring = entry.getKey();
                maxFrequency = entry.getValue();
            }
        }

        System.out.println("Max Occurring Substring: " + maxSubstring);
        System.out.println("Frequency: " + maxFrequency);
    }

    private static boolean isSubstringValid(String substring, int maxUnique) {
        // Check if the number of unique characters in the substring is within the limit
        return substring.chars().distinct().count() <= maxUnique;
    }
}
