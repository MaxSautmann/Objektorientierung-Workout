package Aufgabe3_Songtextsuche;

public class Songtextsuche {
    public static String getURL(String titel, String interpret) {
        titel = titel.toLowerCase();
        interpret = interpret.toLowerCase();
        titel = titel.replace(" ", "_");
        interpret = interpret.replace(" ", "_");
        return "http://lyrics.wikia.com/api.php?func=getSong&artist=" + interpret + "&song=" + titel;
    }
}