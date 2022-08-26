package Schrittzähler;
public class App {

    public static void main(String[] args) throws Exception {

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

}