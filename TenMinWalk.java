/**
 * TenMinWalk class contains utility methods for validating walking paths.
 * This class focuses on determining if a given walk takes exactly 10 minutes
 * and returns the walker to their starting position.
 */
public class TenMinWalk {

    /**
     * Validates whether a walk is exactly 10 minutes long and returns to the starting point.
     *
     * This method simulates a walk on a 2D grid where each step takes 1 minute.
     * The walk is valid if:
     * 1. It takes exactly 10 minutes (10 steps)
     * 2. It returns to the starting position (net displacement is zero)
     *
     * The method uses vector mathematics to track displacement:
     * - North ('n') and South ('s') affect vertical position
     * - East ('e') and West ('w') affect horizontal position
     *
     * @param walk an array of characters representing directions ('n', 's', 'e', 'w')
     * @return true if the walk is exactly 10 steps and returns to start, false otherwise
     *
     * @example
     * isValid(['n','s','n','s','n','s','n','s','n','s']) returns true
     * isValid(['w','e','w','e','w','e','w','e','w','e']) returns true
     * isValid(['n','n','n','s','n','s','n','s','n','s']) returns false (doesn't return to start)
     * isValid(['n','s','n','s','n','s','n','s','n']) returns false (only 9 steps)
     */
    public static boolean isValid(char[] walk) {
        // Track horizontal displacement (east-west)
        int vectorh = 0;
        // Track vertical displacement (north-south)
        int vectorv = 0;

        // Process each step in the walk
        for(int i = 0; i < walk.length; i++) {
            if(walk[i] == 'n') {
                // Moving north increases vertical position
                vectorv += 1;
            } else if (walk[i] == 's') {
                // Moving south decreases vertical position
                vectorv -= 1;
            } else if(walk[i] == 'e') {
                // Moving east increases horizontal position
                vectorh += 1;
            } else if(walk[i] == 'w') {
                // Moving west decreases horizontal position
                vectorh -= 1;
            }
        }

        // Walk is valid if:
        // 1. Net horizontal displacement is zero (vectorh == 0)
        // 2. Net vertical displacement is zero (vectorv == 0)
        // 3. Walk takes exactly 10 minutes (walk.length == 10)
        return (vectorh == 0 && vectorv == 0 && walk.length == 10);
    }
}
