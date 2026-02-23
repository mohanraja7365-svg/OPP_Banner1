public class OOPS_BannerUC3 {
    public static void main(String[] args) {
        // Define each letter using arrays of string segments
        String[][] O = {
            {"  *****  "},
            {" *     * "},
            {"*       *"},
            {"*       *"},
            {"*       *"},
            {" *     * "},
            {"  *****  "}
        };

        String[][] P = {
            {" ******  "},
            {" *     * "},
            {" *     * "},
            {" ******  "},
            {" *       "},
            {" *       "},
            {" *       "}
        };

        String[][] S = {
            {"  ****** "},
            {" *       "},
            {" *       "},
            {"  *****  "},
            {"       * "},
            {"       * "},
            {" ******  "}
        };

        // Letters in order: O O P S
        String[][][] letters = {O, O, P, S};

        // Loop through each of the 7 lines
        for (int i = 0; i < 7; i++) {
            String[] lineSegments = new String[letters.length];
            for (int j = 0; j < letters.length; j++) {
                lineSegments[j] = letters[j][i][0]; // extract the line string
            }
            // Use String.join with empty delimiter for memory-efficient concatenation
            System.out.println(String.join("  ", lineSegments));
        }
    }
}
