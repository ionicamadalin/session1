package org.madalin.ierarhie2;

public class AutovehiculeMaritimeDeSuprafata extends AutovehiculeMaritime {

    private final TipNavigare tipNavigare;

    public AutovehiculeMaritimeDeSuprafata(int culoare, int nrLocuri, double vitezaMaxima, TipNavigare tipNavigare,TipCarburant tipCarburant) {
        super(culoare, nrLocuri, vitezaMaxima,TipCarburant.MOTORINA);
        this.tipNavigare=tipNavigare;
    }

    public TipNavigare getTipNavigare() {
        return tipNavigare.SUPRAFATA;
    }
}
