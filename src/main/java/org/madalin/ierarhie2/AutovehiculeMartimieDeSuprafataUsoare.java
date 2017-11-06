package org.madalin.ierarhie2;

public class AutovehiculeMartimieDeSuprafataUsoare extends AutovehiculeMaritimeDeSuprafata {
    private final int greutate;
    public AutovehiculeMartimieDeSuprafataUsoare(int culoare, int nrLocuri, double vitezaMaxima, TipNavigare tipNavigare,int greutate,TipCarburant tipCarburant ) {
        super(culoare, nrLocuri, vitezaMaxima, tipNavigare.SUPRAFATA,TipCarburant.MOTORINA);
        this.greutate=greutate;
    }


    public int getGreutate() {
        return greutate;
    }
}
