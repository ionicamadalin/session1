package org.madalin.ierarhie2;

public class AutovehiculeMartimieDeSuprafataUsoare extends AutovehiculeMaritimeDeSuprafata {
    private final int greutate;
    public AutovehiculeMartimieDeSuprafataUsoare(int culoare, int nrLocuri, double vitezaMaxima, TipNavigare tipNavigare,int greutate ) {
        super(culoare, nrLocuri, vitezaMaxima, tipNavigare.SUPRAFATA);
        this.greutate=greutate;
    }


    public int getGreutate() {
        return greutate;
    }
}
