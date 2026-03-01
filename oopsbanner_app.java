public class oopsbanner_app {
    public static void main(String[] args){
        
        String[][] bannerLines = { 
            {
                "   ***   ", "   ***   ", "******   ", "   ***** "
            },
            {
                " **   ** ", " **   ** ", "**    ** ", " **      "
            },
            {
                "**     **", "**     **", "**     **", "**       "
            },
            {
                "**     **", "**     **", "**    ** ", " **      "
            },
            {
                "**     **", "**     **", "******   ", "   ***   "
            },
            {
                "**     **", "**     **", "**       ", "      ** "
            },
            {
                "**     **", "**     **", "**       ", "       **"
            },
            {
                " **   ** ", " **   ** ", "**       ", "      ** "
            },
            {
                "   ***   ", "   ***   ", "**       ", " ******  "
            }
        };

        for (String[] line : bannerLines) {
            for (String segment : line) {
                System.out.print(segment + " ");
            }
            System.out.println();
        }
    }
    
}
