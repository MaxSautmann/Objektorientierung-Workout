package Aufgabe_12_AmbientLight;

import java.awt.*;

public class AmbiLight {
    private int farbton, saturation, helligkeit;

    public AmbiLight(int farbton, int saturation, int helligkeit) {
        this.farbton = farbton;
        this.saturation = saturation;
        this.helligkeit = helligkeit;
    }

    public void erhoeheSaturation() {
        if (saturation < 100) {
            saturation = saturation + helligkeit;
        } else {
            saturation = 100;
        }
    }

    public void verringereSaturation() {
        if (saturation > 0) {
            saturation = saturation - 1;
        } else {
            saturation = 0;
        }
    }

    public void erhoeheHelligkeit() {
        if (helligkeit < 100) {
            helligkeit = helligkeit + 1;
        } else {
            helligkeit = 100;
        }
    }

    public void verringereHelligkeit() {
        if (helligkeit > 0) {
            helligkeit = helligkeit - 1;
        } else {
            helligkeit = 0;
        }
    }

    public int[] getNaechsteFarbe() {
        farbton = farbton + 1;
        if (farbton > 360) {
            farbton = 0;
        }
        return farbtonsaturationhelligkeitToRgb(farbton, saturation, helligkeit);
    }

    public int[] getRandomFarbe() {
        farbton = (int) (Math.random() * 360 + 0);
        saturation = (int) (Math.random() * 100 + 0);
        helligkeit = (int) (Math.random() * 100 + 0);
        return farbtonsaturationhelligkeitToRgb(farbton, saturation, helligkeit);
    }

    private int[] farbtonsaturationhelligkeitToRgb(int farbton, int saturation, int helligkeit) {
        int rgb = Color.HSBtoRGB(farbton, saturation / 100, helligkeit / 100);
        Color c = new Color(rgb);
        int[] output = {
                c.getRed(),
                c.getGreen(),
                c.getBlue()
        };
        return output;
    }
}
