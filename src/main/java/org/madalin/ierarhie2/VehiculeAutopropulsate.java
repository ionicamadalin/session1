package org.madalin.ierarhie2;

public abstract class VehiculeAutopropulsate extends Vehicul {
    public VehiculeAutopropulsate(int culoare, int nrLocuri, double vitezaMaxima) {

        super(culoare, nrLocuri, vitezaMaxima);

    }

    protected boolean areMotor() {
        return true;
    }

}
