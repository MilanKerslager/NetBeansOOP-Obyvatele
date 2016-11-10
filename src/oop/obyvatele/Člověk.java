// Každý člověk má svůj objekt nesoucí vlastnosti člověka
// (tj. jméno a rodné číslo)
// Je použita objektová kompozice - třída obsahuje jinou třídu,
// zde konkrétně Člověk má vlstnost rodné číslo, což je také objekt

package oop.obyvatele;

public class Člověk {
    String jmeno;
    RodnéČíslo rc;

    public Člověk(String jmeno, RodnéČíslo rc) {
        this.jmeno = jmeno;
        this.rc = rc;
    }
    
    public void predstavSe() {
        System.out.print("Jsem "+this.jmeno);
        if (this.rc.isMuž() == true) {
            System.out.println(" a jsem muž.");
        } else {
            System.out.println(" a jsem žena.");
        }
        System.out.println("Moje RČ: "+this.rc);
        System.out.println("Narozen: "+this.rc.getDatumNarozeni());
    }
}
