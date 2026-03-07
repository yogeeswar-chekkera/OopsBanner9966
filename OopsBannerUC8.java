import java.util.HashMap;

public class OOPSBannerApp {
    public static HashMap<Character, String[]> createCharacterMap() {

        HashMap<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{"   ***  "," **   ** ","**     **","**     **","**     **"," **   ** ","   ***  "});

        map.put('P', new String[]{"   ****** "," **    **"," **    **"," ****** "," **      "," **      ","   **      "});

        map.put('S', new String[]{"  ****** ","**      ","**      ","  ****** ","      ** ","      ** "," ****** "});

        return map;
    }
    public static void displayBanner(String message,
                                     HashMap<Character, String[]> map) {

        int height = map.get('O').length; 

        for (int row = 0; row < height; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : message.toCharArray()) {
                line.append(map.get(ch)[row]).append("   ");
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        HashMap<Character, String[]> map = createCharacterMap();

        String message = "OOPS";

        displayBanner(message, map);
    }
}
