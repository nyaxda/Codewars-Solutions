import java.util.*;

/**
 * TwoToOne class contains utility methods for string manipulation.
 * This class focuses on combining two strings and extracting unique characters
 * in alphabetical order to create a new sorted string.
 */
public class TwoToOne {

    /**
     * Combines two strings and returns a new string containing all unique characters
     * from both input strings, sorted in alphabetical order.
     *
     * This method uses a TreeSet to automatically handle both uniqueness and sorting.
     * Characters from both strings are added to the set, which eliminates duplicates
     * and maintains alphabetical order. The result is then joined into a single string.
     *
     * @param s1 the first input string
     * @param s2 the second input string
     * @return a string containing all unique characters from both inputs, sorted alphabetically
     *
     * @example
     * longest("aretheyhere", "yestheyarehere") returns "aehrsty"
     * longest("loopingisfunbutdangerous", "lessdangerousthancoding") returns "abcdefghilnoprstu"
     * longest("inmanylanguages", "theresapairoffunctions") returns "acefghilmnoprstuy"
     */
    public static String longest (String s1, String s2) {
        // Use TreeSet to automatically maintain alphabetical order and eliminate duplicates
        Set<String> ts = new TreeSet<>();

        // Add each character from the first string to the set
        for (int i = 0; i < s1.length(); i++) {
            ts.add(String.valueOf(s1.charAt(i)));
        }

        // Add each character from the second string to the set
        // Duplicates will be automatically ignored by the set
        for (int j = 0; j < s2.length(); j++) {
            ts.add(String.valueOf(s2.charAt(j)));
        }

        // Join all unique characters from the set into a single string
        // TreeSet ensures the characters are already in alphabetical order
        return(String.join("", ts));
    }
}