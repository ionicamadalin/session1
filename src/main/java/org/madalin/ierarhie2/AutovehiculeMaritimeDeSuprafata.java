package org.madalin.ierarhie2;

public class AutovehiculeMaritimeDeSuprafata extends AutovehiculeMaritime {

    private final TipNavigare tipNavigare;

    public AutovehiculeMaritimeDeSuprafata(int culoare, int nrLocuri, double vitezaMaxima, TipNavigare tipNavigare) {
        super(culoare, nrLocuri, vitezaMaxima);
        this.tipNavigare=tipNavigare;
    }

    public TipNavigare getTipNavigare() {
        return tipNavigare.SUPRAFATA;
    }
}
