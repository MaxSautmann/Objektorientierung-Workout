package Aufgabe6_Fernbedienung;

public class Fernbedienung {
    private int aktuellerSender;
    private String[] sender;

    public Fernbedienung() {
        aktuellerSender = 0;
        sender = new String[31];
        for (int i = 0; i < sender.length; i++) {
            sender[i] = "Programm " + (i + 1);
        }
    }

    public void SenderHoch() {
        if (aktuellerSender < 30) {
            aktuellerSender++;
        } else {
            aktuellerSender = 0;
        }
    }

    public void SenderRunter() {
        if (aktuellerSender > 0) {
            aktuellerSender--;
        } else {
            aktuellerSender = 30;
        }
    }

    public String getSenderName() {
        return sender[aktuellerSender];
    }

    public void saveName(String name) {
        sender[aktuellerSender] = name;
    }
}