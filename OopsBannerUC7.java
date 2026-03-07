public class OOPSBannerApp {

    static class CharacterPattern {
        char ch;
        String[] pattern;

        CharacterPattern(char ch, String[] pattern) {
            this.ch = ch;
            this.pattern = pattern;
        }
    }

    public static void main(String[] args) {

        CharacterPattern[] maps = {
            new CharacterPattern('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
            }),
            new CharacterPattern('P', new String[]{
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    "
            }),
            new CharacterPattern('S', new String[]{
                " ****",
                "*    ",
                "*    ",
                " *** ",
                "    *",
                "    *",
                "**** "
            })
        };

        String word = "OOPS";

        for (int row = 0; row < 7; row++) {
            for (char c : word.toCharArray()) {
                for (CharacterPattern m : maps) {
                    if (m.ch == c) {
                        System.out.print(m.pattern[row] + "  ");
                    }
                }
            }
            System.out.println();
        }
    }
}
