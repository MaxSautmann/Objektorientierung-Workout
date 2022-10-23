package Aufgabe_13_Verschluesselung;

public class ShiftCipher {
    private int schluessel;

    public ShiftCipher(int schluessel) {
        this.schluessel = schluessel;
    }

    public String verschluesseln(String text) {
        String verschluesselt = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            int pos = getPositionInAlphabet("" + c);
            int neuePos = pos + this.schluessel;
            if (neuePos >= 26) {
                neuePos = (neuePos + 26) % 26;
            }
            char newC = getBuchstabeInPosition(neuePos);
            verschluesselt = verschluesselt + newC;
        }
        return verschluesselt;
    }

    public String entschluesseln(String input) {
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            int pos = getPositionInAlphabet("" + c);
            int neuePos = pos - this.schluessel;
            if (neuePos < 0) {
                neuePos = (neuePos + 26) % 26;
            }
            char newC = getBuchstabeInPosition(neuePos);
            output = output + newC + " ";
        }
        return output;
    }

    private int getPositionInAlphabet(String buchstabe) {
        buchstabe = buchstabe.toLowerCase();
        String buchstabenposition = "abcdefghijklmnopqrstuvwxyz";
        int posNumber = buchstabenposition.indexOf(buchstabe);
        return posNumber;
    }

    private char getBuchstabeInPosition(int pos) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        return alphabet.charAt(pos);
    }
}