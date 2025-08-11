/**
 * Kata5 class provides a method to build a tower of asterisks (*)
 * with a specified number of floors, where each floor is centered.
 */
public class Kata5 {
    /**
     * Builds a tower of asterisks (*) with the given number of floors.
     * Each floor is centered and the number of stars increases by 2 per floor.
     *
     * @param nFloors the number of floors in the tower
     * @return a String array representing the tower, each element is a floor
     */
    public static String[] towerBuilder(int nFloors)
    {
        String[]tower = new String[nFloors];
        for (int i = 0; i < nFloors; i++) {
            int spaces = nFloors - i - 1;
            int stars = 2 * i + 1;

            String floor = " ".repeat(spaces) + "*".repeat(stars) + " ".repeat(spaces);
            tower[i] = floor;
        }
        return tower;
    }

    /**
     * Main method to demonstrate the usage of towerBuilder.
     * Prints a sample tower with 3 floors to the console.
     *
     * @param args command line arguments (not used)
     */
    public static void main (String[] args) {
        // Example usage of the towerBuilder method
        String[] tower = towerBuilder(3);
        for (String floor : tower) {
            System.out.println(floor);
        }
    }
}