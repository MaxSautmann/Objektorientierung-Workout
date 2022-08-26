package Schrittzähler;
public class StepCounter{
    
    int schritte;
    String datum;

    public StepCounter(String pdatum) {

        datum = pdatum;
        schritte = 0;

    }

    public void incrementSteps() {

        schritte++;

    }

    public String toString() {

        return "Am " + datum + " bin ich " + schritte + " Schritte gegangen.";

    }

}

