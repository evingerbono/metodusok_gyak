
package metodusok;

public class Metodusok {

    public static void main(String[] args) {
        feladatok();
        
    }

    private static void feladatok() {
        elso10szamosszegekiir();
        ketszamosszeadasa();
        negyszamosszeadasa();
        haromszOsszeggenekGyoke();
    }

    private static void haromszOsszeggenekGyoke() {
        int eredmeny = osszead(2, osszead(3, 4));
        String szoveg = String.format("A 2+3+4 gyöke = "+ Math.sqrt(eredmeny)+"\n");
        kiir(szoveg);
    }

    private static void negyszamosszeadasa() {
        int eredmeny = osszead(1, osszead(2, osszead(3, 4)));
        String szoveg = String.format("A 1+2+3+4 összege = "+ eredmeny+"\n");
        kiir(szoveg);
    }

    private static void ketszamosszeadasa() {
        int eredmeny = osszead(1, 2);
        String szoveg = String.format("A két szám összege = "+ eredmeny +"\n");
        kiir(szoveg);
    }

    private static void elso10szamosszegekiir() {
        int eredmeny = elso10szamosszege();
        String szoveg = "Az első 10 szám összege = " +eredmeny+"\n";
        kiir(szoveg);
    }
    
    private static int elso10szamosszege(){
     int osszeg=0;
        for (int i = 0; i < 10; i++) {
            osszeg+=i;
        }
        return osszeg;
    }
    
    private static int osszead(int a , int b){
        return a+b;
    }
    
    private static void kiir(String szoveg){
        System.out.print(szoveg);
    } 
}
