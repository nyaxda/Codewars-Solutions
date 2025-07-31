import java.util.List;
import java.util.ArrayList;

/**
 * The Kata class contains utility methods for processing lists of strings.
 */
class Kata {

    /**
     * Filters a list of strings to include only those with exactly 4 characters.
     *
     * @param x The input list of strings to be filtered.
     * @return A new list containing only the strings from the input list
     *         that have exactly 4 characters.
     */
    public static List<String> friend(List<String> x) {
        List<String> output = new ArrayList<>();
        for (String frien : x) {
            if (frien.length() == 4) {
                output.add(frien);
            }
        }
        return output;
    }
}