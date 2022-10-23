package Aufgabe_14_Mastermind;

public class Mastermind {
    public static final int RED = 0;
    public static final int GREEN = 1;
    public static final int BLUE = 2;
    public static final int WHITE = 3;
    public static final int ORANGE = 4;
    public static final int GREY = 5;

    private int[] code;
    private int numMove;

    public Mastermind(int c1, int c2, int c3, int c4) {
        this.code = new int[4];
        code[0] = c1;
        code[1] = c2;
        code[2] = c3;
        code[3] = c4;
        this.numMove = 0;
    }

    private int correctColorsAndPositions(int[] colors) {
        int count = 0;
        for (int i = 0; i < code.length; i++) {
            if (code[i] == colors[i]) {
                count = count + 1;
            }
        }
        return count;
    }

    private int correctColors(int[] colors) {
        int count = 0;
        boolean[] checked = { false, false, false, false };
        for (int i = 0; i < code.length; i++) {
            if (code[i] == colors[i]) {
                checked[i] = true;
            }
        }
        for (int i = 0; i < code.length; i++) {
            for (int j = 0; j < colors.length; j++) {
                if (code[i] == colors[j] && checked[j] == false) {
                    checked[j] = true;
                    count = count + 1;
                    break;
                }
            }
        }
        return count;
    }

    public int[] guess(int c1, int c2, int c3, int c4) {
        int[] output = new int[2];
        int[] colors = { c1, c2, c3, c4 };
        output[0] = correctColorsAndPositions(colors);
        output[1] = correctColors(colors);
        numMove = numMove + 1;
        return output;
    }
}