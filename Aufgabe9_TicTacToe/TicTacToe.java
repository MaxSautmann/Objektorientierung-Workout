package Aufgabe9_TicTacToe;

public class TicTacToe {
    private int[] spielfeld;
    private int mark;

    public TicTacToe() {
        spielfeld = new int[9];
        reset();
    }

    public void reset() {
        for (int i = 0; i < spielfeld.length; i++) {
            spielfeld[i] = 0;
        }
        mark = 1;
    }

    public boolean setMark(int x, int y) {
        if (x < 0 || x > 2 || y < 0 || y > 2) {
            return false;
        }
        int position = 3 * y + x;
        if (spielfeld[position] > 0) {
            return false;
        }
        spielfeld[position] = mark;
        mark = (mark % 2) + 1;
        return true;
    }

    public String toString() {
        String temp = "";
        for (int i = 0; i < spielfeld.length; i++) {
            switch (spielfeld[i]) {
                case 0:
                    temp = temp + " ";
                    break;
                case 1:
                    temp = temp + "X";
                    break;
                case 2:
                    temp = temp + "0";
                    break;
                default:
                    temp = temp + " ";
            }
            if ((i + 1) % 3 != 0) {
                temp = temp + "|";
            }
            if ((i + 1) % 3 == 0 && i < 6) {
                temp = temp + "\n";
                temp = temp + "-+-+-";
                temp = temp + "\n";
            }
        }
        return temp = temp + "\n";
    }
}