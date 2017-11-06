package org.madalin.ierarhie2;

public class Vapor extends AutovehiculeMaritimeDeSuprafataGrele {
    private final boolean distantaMare;

    public boolean isDistantaMare() {
        return distantaMare;
    }

    public Vapor(int culoare, int nrLocuri, double vitezaMaxima, TipNavigare tipNavigare, int greuate, boolean distantaMare) {
        super(culoare, nrLocuri, vitezaMaxima=100, tipNavigare.SUPRAFATA, greuate);
        this.distantaMare=distantaMare;

    }

}
