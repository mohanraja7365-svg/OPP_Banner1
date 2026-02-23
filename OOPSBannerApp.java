/**
 * OOPSBannerApp
 * UC4: Render OOPS as Banner using String Array and Loop
 *
 * Stores banner lines in a String array and prints them using a loop.
 *
 * @author YourName
 * @version 1.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        // String array to store 7 lines of the OOPS banner
        String[] banner = new String[7];

        // Populate banner lines using String.join()
        banner[0] = String.join("  ",
                "*********",
                "*********",
                "*********",
                " *********");

        banner[1] = String.join("  ",
                "*       *",
                "*       *",
                "*       *",
                "*        ");

        banner[2] = String.join("  ",
                "*       *",
                "*       *",
                "*********",
                "*********");

        banner[3] = String.join("  ",
                "*       *",
                "*       *",
                "*        ",
                "        *");

        banner[4] = String.join("  ",
                "*       *",
                "*       *",
                "*        ",
                "        *");

        banner[5] = String.join("  ",
                "*       *",
                "*       *",
                "*        ",
                "*       *");

        banner[6] = String.join("  ",
                "*********",
                "*********",
                "*        ",
                "*********");

        // Print banner using enhanced for loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}