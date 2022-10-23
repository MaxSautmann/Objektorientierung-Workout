package Aufgabe_10_Zwischenablage;

public class Zwischenablage {
    private String[] zwischenablage;
    private int position;

    public Zwischenablage(int groesse) {
        this.zwischenablage = new String[groesse];
        this.position = -1;
    }

    public void copy(String string) {
        if (position < zwischenablage.length - 1) {
            position = position + 1;
            zwischenablage[position] = string;
        } else {
            zwischenablage[0] = null;
            for (int i = 1; i < zwischenablage.length; i++) {
                zwischenablage[i - 1] = zwischenablage[i];
                zwischenablage[position] = string;
            }
        }
    }

    public String paste() {
        String string = zwischenablage[position];
        zwischenablage[position] = null;
        if (this.position > 0) {
            position = position - 1;
        } else {
            position = 0;
        }
        return string;
    }

    public String toString() {
        String output = "[";
        int i = 0;
        for (i = 0; i < zwischenablage.length; i++) {
            output = output + zwischenablage[i] + ", ";
        }
        i = i - 1;
        output = output + zwischenablage[i] + "]";
        return output;
    }
}