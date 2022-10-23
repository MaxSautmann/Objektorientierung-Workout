package Aufgabe2_BodyMassIndex;

public class Health {

        static double bmi;

        public static double calculateBMI(int gewicht, double groesse) {
            bmi = gewicht / (groesse * groesse);
            return bmi;
        }

        public static String bmi(int gewicht, double groesse) {
            double bmi = calculateBMI(gewicht, groesse);
            String gewichtsklasse = "";
            if (bmi <= 18.5) {
                gewichtsklasse = "untergewichtig";
            } else if (bmi > 18.5 && bmi <= 25) {
                gewichtsklasse = "normalgewichtig";
            } else if (bmi > 25 && bmi <= 30) {
                gewichtsklasse = "übergewichtig";
            } else {
                gewichtsklasse = "fettleibig";
            }
            return "Mit einem BMI von " + bmi + " sind Sie " + gewichtsklasse + ".";
        }
    }

