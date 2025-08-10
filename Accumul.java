/**
 * Accumul class contains utility methods for string transformation.
 * This class focuses on creating accumulative character patterns where each character
 * is repeated based on its position in the string, with specific formatting rules.
 */
public class Accumul {

    /**
     * Transforms a string by creating an accumulative pattern where each character
     * is repeated based on its position and formatted with specific case rules.
     *
     * For each character at position i (0-based):
     * - The character appears (i+1) times total
     * - First occurrence is uppercase
     * - Subsequent occurrences are lowercase
     * - Each group is separated by a hyphen (-)
     *
     * @param s the input string to transform
     * @return a formatted string with accumulative character patterns separated by hyphens
     *
     * @example
     * accum("abcd") returns "A-Bb-Ccc-Dddd"
     * accum("RqaEzty") returns "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
     * accum("a") returns "A"
     * accum("") returns ""
     */
    public static String accum(String s) {
        // Handle empty string case
        if (!s.isEmpty()){
            StringBuilder sb = new StringBuilder();

            // Process each character in the input string
            for(int i = 0; i < s.length(); i++) {
                // Add the character in uppercase (first occurrence)
                sb.append(s.substring(i, i + 1).toUpperCase());

                // Add the character in lowercase for (position) times
                // j starts at i-1 and goes down to 0, so it runs i times total
                for(int j = i - 1; j >= 0; j--) {
                    sb.append(s.substring(i, i + 1).toLowerCase());
                }

                // Add hyphen separator between groups (except after the last character)
                if (i + 1 < s.length()) {
                    sb.append("-");
                }
            }
            return sb.toString();
        }
        else{
            return "";
        }
    }

    /**
     * Main method to demonstrate the functionality of the accum method.
     * Provides example usage with different input strings.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        // Example usage demonstrating various input cases
        System.out.println(accum("a")); // Output: "A"
        System.out.println(accum("abcd")); // Output: "A-Bb-Ccc-Dddd"
        System.out.println(accum("RqaEzty")); // Output: "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
    }
}