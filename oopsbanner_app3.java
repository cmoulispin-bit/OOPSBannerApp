public class oopsbanner_app3{
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
        String banner = String.join(" ", line1) + "\n" +
                        String.join(" ", line2) + "\n" +
                        String.join(" ", line3) + "\n" +
                        String.join(" ", line4) + "\n" +
                        String.join(" ", line5) + "\n" +
                        String.join(" ", line6) + "\n" +
                        String.join(" ", line7) + "\n" +
                        String.join(" ", line8) + "\n" +
                        String.join(" ", line9);
        System.out.println(banner);
    }
}