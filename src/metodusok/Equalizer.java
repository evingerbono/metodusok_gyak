
package metodusok;

import java.util.Random;

public class Equalizer {
    public static void main(String[] args) {
      eq();
      eq();
      eq();
      eq();
      eq();
    }

    private static void eq() {
        Random rnd = new Random();
        int also=3, felso=7;
        int hossz= rnd.nextInt(felso-also+1)+also;
        System.out.println(hossz);
        for (int i = 0; i < hossz; i++) {
            System.out.printf("\u001B[45m" + " ");
        }
        System.out.println("");
    }
}
