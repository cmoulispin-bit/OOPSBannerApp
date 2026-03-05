public class OOPSBannerApp {
    
    public static String[] getOpattern() {
        String[] lines =   {"   ***    ",
                            " **   **  ",
                            "**     ** ",
                            "**     ** ",
                            "**     ** ",
                            "**     ** ",
                            "**     ** ",
                            "   ***    "};
        return lines;
    }
    public static String[] getPpattern() {
        String[] lines =  {"******   ",
                        "**    ** ",
                        "**    ** ",
                        "******   ",
                        "**       ",
                        "**       ",
                        "**       ",
                        "**       ",
                        "**       "};

        return lines;
    }
    public static String[] getSpattern() {
        String[] lines = {"   *****  ",
                        " **      ",
                        "**       ",
                        "   ***   ",
                        "      ** ",
                        "      ** ",
                        " **   ** ",
                        "  *****  "};
        return lines;
    }
    public static void main(String[] args) {
        String[] oPattern = getOpattern();
        String[] pPattern = getPpattern();
        String[] sPattern = getSpattern();

        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(oPattern[i] + oPattern[i]+ pPattern[i]  + sPattern[i]);
        }
    }
}
