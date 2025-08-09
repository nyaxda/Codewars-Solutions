/**
 * Kata4 class contains utility methods for string manipulation.
 * This class focuses on reversing individual words within a string
 * while preserving the original whitespace structure.
 */
public class Kata4 {

    /**
     * Reverses each word in the given string while preserving whitespace positions.
     *
     * This method processes the input string character by character, identifying
     * words (sequences of non-whitespace characters) and reversing them individually.
     * All whitespace characters (spaces, tabs, newlines, etc.) remain in their
     * original positions.
     *
     * @param original the input string containing words separated by whitespace
     * @return a new string with each word reversed but whitespace preserved
     *
     * @example
     * reverseWords("The quick brown fox") returns "ehT kciuq nworb xof"
     * reverseWords("a   b") returns "a   b" (multiple spaces preserved)
     * reverseWords("") returns ""
     */
    public static String reverseWords(final String original) {
        StringBuilder sb = new StringBuilder();
        int i = 0;

        // Iterate through each character in the original string
        while(i < original.length()) {
            // If current character is whitespace, preserve it
            if (Character.isWhitespace(original.charAt(i))) {
                sb.append(" ");
                i++;
            } else {
                // Find the end of the current word
                int j = i;
                while (j < original.length() && !Character.isWhitespace(original.charAt(j))) {
                    j++;
                }

                // Extract the word from position i to j-1
                String sub = original.substring(i, j);

                // Reverse the word by appending characters from end to beginning
                for(int k = sub.length() - 1; k >= 0; k--) {
                    sb.append(sub.charAt(k));
                }

                // Move to the next position after the current word
                i = j;
            }
        }
        return sb.toString();
    }
}