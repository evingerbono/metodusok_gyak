
package metodusok;

import java.util.Random;

public class Equalizer {
    private static Random rnd = new Random();
    public static void main(String[] args) {
      equalizer5lefut();
    }

    private static void equalizer5lefut() {
        eq();
        eq(12);
        eq();
        eq(8);
        eq();
    }

    private static void eq() {
        int also=3, felso=7;
        int hossz= rnd.nextInt(felso-also+1)+also;
        for (int i = 0; i < hossz; i++) {
            System.out.printf("\u001B[45m" + " ");
        }
        System.out.println("");
    }
    
    private static void eq(int hossz) {
        for (int i = 0; i < hossz; i++) {
            System.out.printf("\u001B[45m" + " ");
        }
        System.out.println("");
    }
}
