public class OOPS_Banner {
    public static void main(String[] args) {
        // Each letter represented as a 7x9 pattern
        String[] O = {
            "  *****  ",
            " *     * ",
            "*       *",
            "*       *",
            "*       *",
            " *     * ",
            "  *****  "
        };

        String[] P = {
            " ******  ",
            " *     * ",
            " *     * ",
            " ******  ",
            " *       ",
            " *       ",
            " *       "
        };

        String[] S = {
            "  ****** ",
            " *       ",
            " *       ",
            "  *****  ",
            "       * ",
            "       * ",
            " ******  "
        };

        // Letters in order: O O P S
        String[][] letters = {O, O, P, S};

        // Print line by line
        for (int i = 0; i < 7; i++) {
            String line = "";
            for (String[] letter : letters) {
                line += letter[i] + "  "; // space between letters
            }
            System.out.println(line);
        }
    }
}
