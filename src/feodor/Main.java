package feodor;

public class Main {

    public static void main(String[] args) {
        String[][] map = { {"5", "7", "3"}, {"7", "0", "1"}, {"8", "1", "2"} };
        String[] lines = new String[3];
        drawMaps(lines, map);
        for (String line : lines) {
            System.out.println(line);
        }
    }


    private static void drawMaps(String[] lines, String[][] map) {
        for (int i = 0; i < map.length; i++) {
            StringBuilder builder = new StringBuilder();
            for (int j = 0; j < map[i].length; j++) {
                builder.append(map[j][map.length - i - 1]);
                builder.append(" ");
            }
            lines[i] = builder.toString();
        }
    }

}
