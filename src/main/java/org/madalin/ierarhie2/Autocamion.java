package org.madalin.ierarhie2;

public class Autocamion extends AutovehiculTransoportUscat {
    private final boolean remorca;
    public Autocamion(int culoare, int nrLocuri, double vitezaMaxima,boolean remorca) {
        super(culoare, nrLocuri, vitezaMaxima, TipTransport.USCAT);
        this.remorca=remorca;
    }

    public boolean isRemorca() {
        return true;
    }

}
