package Aufgabe4_Passwort;

import java.util.Arrays;

public class Passwort {
    private char[] passwort;

    public Passwort(char[] pPasswort) {
        this.passwort = new char[pPasswort.length];

        for (int i = 0; i < passwort.length; i++) {
            this.passwort[i] = pPasswort[i];
        }
    }

    public boolean isStrong(char[] pPasswort) {
        boolean lower = false;
        boolean upper = false;
        boolean figure = false;
        boolean special = false;

        for (int i = 0; i < pPasswort.length; i++) {
            if (pPasswort[i] >= 'a' && pPasswort[i] <= 'z') {
                lower = true;
            }
            if (pPasswort[i] >= 'A' && pPasswort[i] <= 'Z') {
                upper = true;
            }
            if (pPasswort[i] >= '0' && pPasswort[i] <= '9') {
                figure = true;
            }
            if (pPasswort[i] >= '!' && pPasswort[i] <= '*') {
                special = true;
            }
        }
        if (pPasswort.length < 8) {
            return false;
        }
        if (lower == true && upper == true && figure == true && special == true) {
            return true;
        } else {
            return false;
        }
    }

    public boolean changePassword(char[] altesPW, char[] neuesPW) {
        if (!Arrays.equals(passwort, altesPW)) {
            return false;
        }
        if (!isStrong(neuesPW)) {
            return false;
        }
        this.passwort = neuesPW;
        return true;
    }

    public void deletePassword() {
        this.passwort = null;
    }
}