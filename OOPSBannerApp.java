public class OOPSBannerApp {

    static class CharacterPatternMap {
        Character character;
        String[] pattern;

        public CharacterPatternMap(Character character, String[] pattern){

            this.character = character;

            this.pattern = pattern;
        }

        public Character getCharacter(){
            return character;
        }
        public String[] getPattern(){
            return pattern;
        }

    }

    public static CharacterPatternMap[] createCharacterPatternMaps() {
        CharacterPatternMap[] charMaps = new CharacterPatternMap[26];
        charMaps[0] = new CharacterPatternMap('o', new String[]{
            "   ***   ",
            " **   ** ",
            "**     **",
            "**     **",
            "**     **",
            "**     **",
            "**     **",
            "  *****  ",
        });
        charMaps[1] = new CharacterPatternMap('p', new String[]{
            " ***** ",
            "*     *",
            "*     *",
            " ***** ",
            "*      ",
            "*      ",
            "*      ",
            "*      ",
        });
 
        charMaps[2] = new CharacterPatternMap('s', new String[]{
            "  ***  ",
            " *   * ",
            "*      ",
            "*      ",
            " ***** ",
            "     * ",
            "      *",
            " ***** ",
            
        });

        return charMaps;
    }


    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps){
        for (CharacterPatternMap charMap : charMaps) {
            if (charMap.getCharacter() == ch) {
                return charMap.getPattern();
            }
        }
        return null;
    }

    public static void printMessage(String message, CharacterPatternMap[] charMaps){
        StringBuilder[] outputLines = new StringBuilder[10];
        for (int i = 0; i < outputLines.length; i++) {
            outputLines[i] = new StringBuilder();
        }

        for (char ch : message.toCharArray()) {
            String[] pattern = getCharacterPattern(ch, charMaps);
            if (pattern != null) {
                for (int i = 0; i < pattern.length; i++) {
                    outputLines[i].append(pattern[i]).append(" ");
                }
            }
        }

        for (StringBuilder line : outputLines) {
            System.out.println(line.toString());
        }
    }

    
    public static void main(String[] args) {
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();
        printMessage("oops", charMaps);
    }
}