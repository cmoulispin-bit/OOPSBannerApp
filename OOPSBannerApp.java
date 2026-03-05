import java.util.HashMap;
public class OOPSBannerApp {
    public static HashMap<Character, String[]> createCharacterMap(){
        HashMap<Character, String[]> charMap = new HashMap<>(); 
        

        charMap.put('o', new String[]{
            "   ***   ",
            " **   ** ",
            "**     **",
            "**     **",
            "**     **",
            "**     **",
            " **   ** ",
            "   ***   "
        });
        charMap.put ('p', new String[]{
            "******   ",
            "**    ** ",
            "**    ** ",
            "******   ",
            "**       ",
            "**       ",
            "**       ",
            "**       "
        });
        charMap.put('s', new String[]{
            "   ***** ",
            " **      ",
            "**       ",
            " **      ",
            "   ***** ",
            "        **",
            "        **",
            "   *****  "
        });
        return charMap;
    }
    public static void displayBanner(String message, HashMap<Character, String[]> charMap){
        int patternHeight = charMap.get('o').length;

        for(int line = 0; line <= patternHeight; line++ ){
            StringBuilder sb = new StringBuilder();
            for (char ch : message.toCharArray() ){
                String[] pattern = charMap.get(ch);
                sb.append(pattern[line]).append("  ");// adding space betwn characters
            }
            System.out.println(sb.toString());
        }
    }

    public static void main(String[] args){
        HashMap<Character, String[]> charMap = createCharacterMap();
        String message = "oops";
        displayBanner(message, charMap);

    }
}
