package Aufgabe7_Stoppuhr;

public class StopWatch {
    private double startzeit;
    private double stopzeit;

    public void start() {
        if (this.startzeit == 0) {
            this.startzeit = System.currentTimeMillis();
        }
    }

    public void stop() {
        if (stopzeit == 0) {
            this.stopzeit = System.currentTimeMillis();
        }
    }

    public double vergangeneZeit() {
        if (this.stopzeit != 0) {
            return (this.stopzeit - this.startzeit) / 1000;
        }

        return (System.currentTimeMillis() - this.startzeit) / 1000;
    }
}
