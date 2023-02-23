
package metodusok;

public class Metodusok {

    public static void main(String[] args) {
        int eredmeny=elso10szamosszege();
        String szoveg= String.format("Az első 10 szám összege = \n",eredmeny);
        kiir(szoveg);
        eredmeny=osszead(1,2);
        szoveg=String.format("A két szám összege = \n",eredmeny);
        kiir(szoveg);
        
        eredmeny=osszead(1,2)+osszead(3,4);
        szoveg=String.format("A négy szám összege = \n",eredmeny);
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
