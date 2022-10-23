import Aufgabe1_Schrittzaehler.StepCounter;
import Aufgabe2_BodyMassIndex.Health;
import Aufgabe3_Songtextsuche.Songtextsuche;
import Aufgabe4_Passwort.Passwort;
import Aufgabe5_Kopffitness.MultiplicationQuiz;
import Aufgabe6_Fernbedienung.Fernbedienung;
import Aufgabe7_Stoppuhr.StopWatch;
import Aufgabe8_Druckerwarteschlange.PrinterQueue;
import Aufgabe9_TicTacToe.TicTacToe;
import Aufgabe10_Zwischenablage.Zwischenablage;
import Aufgabe11_Temperaturgraph.TemperatureGraph;
import Aufgabe12_AmbientLight.AmbiLight;
import Aufgabe13_Verschluesselung.ShiftCipher;
import Aufgabe14_Mastermind.Mastermind;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Willkommen zu meinem Workout");
        breakLine();

        auswahl();
    }


    public static void auswahl() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welche Aufgabe möchten Sie sich ansehen?");
        System.out.println("(1) Schrittzähler \n(2) BodyMassIndex");
        System.out.println("(3) Songtextsuche \n(4) Passwort");
        System.out.println("(5) Kopffitness \n(6) Fernbedienung");
        System.out.println("(7) Stoppuhr \n(8) Druckerwarteschlange");
        System.out.println("(9) TicTacToe \n(10) Zwischenablage");
        System.out.println("(11) Temperaturgraph \n(12) AmbientLight");
        System.out.println("(13) Verschlüsselung \n(14) Mastermind");
        breakLine();

        String entscheidung = sc.nextLine();
        switch (entscheidung) {
            case "1":
                breakLine();
                aufgabe1();
                breakLine();
                auswahl();
                break;
            case "2":
                breakLine();
                aufgabe2();
                breakLine();
                auswahl();
                break;
            case "3":
                breakLine();
                aufgabe3();
                breakLine();
                auswahl();
                break;
            case "4":
                breakLine();
                aufgabe4();
                breakLine();
                auswahl();
                break;
            case "5":
                breakLine();
                aufgabe5();
                breakLine();
                auswahl();
                break;
            case "6":
                breakLine();
                aufgabe6();
                breakLine();
                auswahl();
                break;
            case "7":
                breakLine();
                aufgabe7();
                breakLine();
                auswahl();
                break;
            case "8":
                breakLine();
                aufgabe8();
                breakLine();
                auswahl();
                break;
            case "9":
                breakLine();
                aufgabe9();
                breakLine();
                auswahl();
                break;
            case "10":
                breakLine();
                aufgabe10();
                breakLine();
                auswahl();
                break;
            case "11":
                breakLine();
                aufgabe11();
                breakLine();
                auswahl();
                break;
            case "12":
                breakLine();
                aufgabe12();
                breakLine();
                auswahl();
                break;
            case "13":
                breakLine();
                aufgabe13();
                breakLine();
                auswahl();
                break;
            case "14":
                breakLine();
                aufgabe14();
                breakLine();
                auswahl();
                break;
            default:
                breakLine();
                System.out.println("Eingabefehler, bitte wähle erneut aus!");
                breakLine();
        }
        sc.close();
    }


    public static void breakLine() {
        System.out.println("------------------------------");
    }

    // Aufgabe 1
    public static void aufgabe1() {
        StepCounter sc = new StepCounter ("11.11.2011");

        for (int i = 0; i < 1111; i++) {
            sc.incrementSteps();
        }

        System.out.println(sc);

        StepCounter sc1 = new StepCounter("1.9.2017");

        for (int i = 0; i < 10000; i++) {
            sc1.incrementSteps();
        }

        System.out.println(sc1);
    }

    // Aufgabe 2
    public static void aufgabe2() {
        System.out.println(Health.bmi(57, 1.8));
    }

    // Aufgabe 3
    public static void aufgabe3() {
        System.out.println(Songtextsuche.getURL("MFG", "Die Fantastischen Vier"));
    }

    // Aufgabe 4
    public static void aufgabe4() {
        char[] pwd_first = "PassWD15!!".toCharArray();
        char[] pwd_weak = "1234567890".toCharArray();
        char[] pwd_strong = "NewPWD16!!".toCharArray();

        Passwort pwd = new Passwort(pwd_first);
        System.out.println(pwd.changePassword(pwd_first, pwd_weak));
        pwd_first[0] = 'p';
        System.out.println(pwd.changePassword(pwd_first, pwd_strong));
        pwd_first[0] = 'P';
        System.out.println(pwd.changePassword(pwd_first, pwd_strong));
    }

    // Aufgabe 5
    public static void aufgabe5() {
        MultiplicationQuiz mq = new MultiplicationQuiz();
        System.out.println(mq.getExercise());
        System.out.println(mq.getResult());
    }

    // Aufgabe 6
    public static void aufgabe6() {
        Fernbedienung fb = new Fernbedienung();
        fb.saveName("ARD");
        for (int i = 0; i < 31; i++) {
            System.out.println(fb.getSenderName());
            fb.SenderHoch();
        }
    }

    // Aufgabe 7 (kompliziert)
    public static void aufgabe7() {
        StopWatch sw = new StopWatch();
        sw.start();
        try {
            Thread.sleep(1000);
            sw.stop();
            System.out.println(sw.vergangeneZeit());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    // Aufgabe 8 (kompliziert)
    public static void aufgabe8() {
        PrinterQueue pq = new PrinterQueue(1);
        try {
            pq.addJob("Hallo");
            pq.addJob("Weiter");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(pq.nextJob());
        System.out.println(pq.nextJob());
        try {
            pq.addJob("Weiter");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(pq.nextJob());
    }

    // Aufgabe 9
    public static void aufgabe9() {
        TicTacToe ttt = new TicTacToe();
        System.out.println(ttt);
        ttt.setMark(2, 2);
        System.out.println(ttt);
        ttt.setMark(2, 0);
        System.out.println(ttt);
        ttt.setMark(1, 1);
        System.out.println(ttt);
    }

    // Aufgabe 10
    public static void aufgabe10() {
        Zwischenablage za = new Zwischenablage(4);
        za.copy("Die");
        System.out.println(za);
        za.copy("Banane");
        System.out.println(za);
        za.copy("ist");
        System.out.println(za);
        za.copy("krumm");
        System.out.println(za);
    }

    // Aufgabe 11
    public static void aufgabe11() {
        TemperatureGraph tg = new TemperatureGraph(2022);
        tg.addTemperatur(1, 2);
        tg.addTemperatur(2, -3);
        tg.addTemperatur(3, 7);
        tg.addTemperatur(4, 8);
        tg.addTemperatur(5, 14);
        tg.addTemperatur(6, 16);
        tg.addTemperatur(7, 17);
        tg.addTemperatur(8, 18);
        tg.addTemperatur(9, 14);
        tg.addTemperatur(10, 9);
        tg.addTemperatur(11, 5);
        tg.addTemperatur(12, 2);
        tg.ausgabeGraph();
        System.out.println("Das Jahr ist " + TemperatureGraph.jahr);
    }

    // Aufgabe 12
    public static void aufgabe12() {
        AmbiLight al = new AmbiLight(0, 0, 50);
        for (int i = 0; i < 50; i++) {
            al.erhoeheHelligkeit();
            System.out.println(al.getNaechsteFarbe());
        }
    }

    // Aufgabe 13
    public static void aufgabe13() {
        ShiftCipher sc = new ShiftCipher(3);
        String verschluesselt = sc.verschluesseln("abcdefghijklmnopqrstuvwxyz");
        System.out.println(verschluesselt);
        System.out.println(sc.entschluesseln(verschluesselt));
        sc = new ShiftCipher(3);
        verschluesselt = sc.verschluesseln("DieserTextIstVerschluesselt");
        System.out.println(verschluesselt);
        System.out.println(sc.entschluesseln(verschluesselt));
    }

    // Aufgabe 14
    public static void aufgabe14() {
        Mastermind mm = new Mastermind(
                Mastermind.RED,
                Mastermind.BLUE,
                Mastermind.GREY,
                Mastermind.BLUE);
        int[] guess = mm.guess(
                Mastermind.GREEN,
                Mastermind.GREY,
                Mastermind.BLUE,
                Mastermind.BLUE);
        System.out.println("Code: Rot, Blau, Grau, Blau");
        System.err.println("Guess: Grün, Grau, Blau, Blau");
        System.out.println("correctColorsAndPositions: \t" + guess[0]);
        System.out.println("correctColors: \t\t" + guess[1]);
    }
}