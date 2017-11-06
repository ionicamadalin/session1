package org.madalin.ierarhie2;

public class AutovehiculeMaritimeDeSuprafataGrele extends AutovehiculeMaritimeDeSuprafata {
    private final int greuate;

    public int getGreuate() {
        return greuate;
    }

    public AutovehiculeMaritimeDeSuprafataGrele(int culoare, int nrLocuri, double vitezaMaxima, TipNavigare tipNavigare, int greuate) {
        super(culoare, nrLocuri, vitezaMaxima, tipNavigare.SUPRAFATA,TipCarburant.MOTORINA);
        this.greuate=greuate;

    }

}
