package org.madalin.ierarhie2;

public abstract class VehiculeSemiPropulsate extends Vehicul {
    public VehiculeSemiPropulsate(int culoare, int nrLocuri, double vitezaMaxima, TipCarburant tipCarburant) {
        super(culoare, nrLocuri, vitezaMaxima);
    }

    protected boolean areMotor() {
        return false;
    }

    @Override
    public TipCarburant tipCarburant() {
        return TipCarburant.FORTAUMANA;
    }
}
