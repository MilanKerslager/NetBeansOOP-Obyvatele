// evidence obyvatel
// obyvatel má rodné číslo, barva očí
// věk, pohlaví, a datum narození zjistíme z rodného čísla

package oop.obyvatele;

public class OOPObyvatele {

    public static void main(String[] args) {
        Člověk c = new Člověk("René", new RodnéČíslo("720407/1111"));
        c.predstavSe();
        
    }
    
}
