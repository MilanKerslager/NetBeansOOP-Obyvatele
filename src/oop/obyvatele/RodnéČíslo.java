// RodnéČíslo je třída, protože pak bude moct mít metody,
// které budou umět říct pohlaví a datum narození
package oop.obyvatele;

class RodnéČíslo {

    String rc;

    public RodnéČíslo(String rc) {
        this.rc = rc;
    }

    // aby šlo rodné číslo vypsat (předefinování implicitní metody toString())
    public String toString() {
        return rc;
    }

    public boolean isMuž() {
        if (Integer.valueOf(rc.substring(2, 4)) <= 12) {
            return true;
        } else {
            return false;
        }
    }

    public String getDatumNarozeni() {
        return rc.substring(4, 6) + "." + 
                rc.substring(2, 4) + "." + 
                rc.substring(0, 2);
    }
}
