import java.util.*;

/**
 * DescendingOrder class contains utility methods for number manipulation.
 * This class focuses on sorting the digits of an integer in descending order
 * to create the largest possible number from those digits.
 */
public class DescendingOrder {

    /**
     * Sorts the digits of the given number in descending order to form the largest possible number.
     *
     * This method converts the input number to a string to access individual digits,
     * then uses a selection sort approach to arrange the digits from highest to lowest.
     * The sorted digits are then reconstructed into a new integer.
     *
     * @param num the input integer whose digits need to be sorted in descending order
     * @return a new integer with digits arranged in descending order to form the largest possible number
     *
     * @example
     * sortDesc(42145) returns 54421
     * sortDesc(145263) returns 654321
     * sortDesc(123) returns 321
     * sortDesc(1) returns 1
     */
    public static int sortDesc(final int num) {
        // Convert the number to string to easily access individual digits
        String numbStr = Integer.toString(num);
        StringBuilder sb = new StringBuilder();

        // Create a list to store individual digits as integers
        ArrayList<Integer> numbr = new ArrayList<>();

        // Extract each digit from the string and add to the list
        for(int i = 0; i < numbStr.length(); i++) {
            numbr.add(Character.getNumericValue(numbStr.charAt(i)));
        }

        // Use selection sort approach to find and remove the highest digit repeatedly
        while(numbr.size() > 0){
            // Find the highest digit in the remaining list
            int highNum = numbr.get(0);
            for(int i = 0; i < numbr.size(); i++) {
                if (numbr.get(i) > highNum) {
                    highNum = numbr.get(i);
                }
            }

            // Append the highest digit to the result
            sb.append(highNum);

            // Remove the highest digit from the list (removes first occurrence)
            numbr.remove(Integer.valueOf(highNum));
        }

        // Convert the sorted digit string back to integer and return
        return Integer.parseInt(sb.toString());
    }
}