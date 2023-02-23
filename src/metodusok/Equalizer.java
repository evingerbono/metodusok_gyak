package metodusok;

import java.util.Random;

public class Equalizer {

    private static Random rnd = new Random();

    public static void main(String[] args) {
        equalizer5lefut();
    }

    private static void equalizer5lefut() {
        eq();
        eq(8, true);
        eq(12);
        eq(true);
        eq();
    }

    private static void eq() {
        int also = 3, felso = 7;
        int hossz = rnd.nextInt(felso - also + 1) + also;
        eq(hossz,false);
    }

    private static void eq(int hossz) {
        eq(hossz,false);
    }

    private static void eq(boolean igaz) {
        eq(igaz);
    }

    private static void eq(int hossz, boolean igaz) {
        for (int i = 0; i < hossz; i++) {
            System.out.printf("\u001B[45m" + " ");
        }
        if (igaz==true) {
            System.out.print(hossz);
        }
        System.out.println("");

    }
}
