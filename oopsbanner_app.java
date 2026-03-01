public class oopsbanner_app {
    public static void main(String[] args){
        String[] line1 = {
            "   ***   ", "   ***   ", "******   ", "   ***** "
        };
        String[] line2 = {
            " **   ** ", " **   ** ", "**    ** ", " **      "
        };
        String[] line3 = {
            "**     **", "**     **", "**     **", "**       "
        };
        String[] line4 = {
            "**     **", "**     **", "**    ** ", " **      "
        };
        String[] line5 = {
            "**     **", "**     **", "******   ", "   ***   "
        };
        String[] line6 = {
            "**     **", "**     **", "**       ", "      ** "
        };
        String[] line7 = {
            "**     **", "**     **", "**       ", "       **"
        };
        String[] line8 = {
            " **   ** ", " **   ** ", "**       ", "      ** "
        };
        String[] line9 = {
            "   ***   ", "   ***   ", "**       ", " ******  "
        };
        String[][] bannerLines = {
            line1, line2, line3, line4, line5, line6, line7, line8, line9
        };
        for (String[] line : bannerLines) {
            System.out.println(String.join(" ", line));
        }
    }
    
}
