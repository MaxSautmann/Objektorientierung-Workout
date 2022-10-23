package Aufgabe8_Druckerwarteschlange;

public class PrinterQueue {
    private String[] jobs;
    private int naechsterSlot;
    private int naechsterJob;
    private int anzahlJobs;
    private int maximalJobs;

    public PrinterQueue(int maximalJobs) {
        jobs = new String[maximalJobs];
        this.naechsterJob = 0;
        this.naechsterSlot = 0;
        this.anzahlJobs = 0;
        this.maximalJobs = maximalJobs;
    }

    public void addJob(String job) throws Exception {
        if (anzahlJobs >= maximalJobs) {
            throw new Exception("Exception: Maximalanzahl an Jobs erreicht");
        }
        jobs[naechsterSlot] = job;
        naechsterSlot = (naechsterSlot + 1) % maximalJobs;
        anzahlJobs = anzahlJobs + 1;
    }

    public String nextJob() {
        String job = null;
        if (anzahlJobs > 0) {
            anzahlJobs = anzahlJobs - 1;
            job = jobs[naechsterJob];
            naechsterJob = (naechsterJob + 1) % maximalJobs;
        }
        return job;
    }
}