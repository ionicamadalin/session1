package org.madalin.ierarhie2;

public class Bicicleta extends VehiculeSemiPropulsate {
    public Bicicleta(int culoare, int nrLocuri, double vitezaMaxima) {
        super(culoare, nrLocuri, vitezaMaxima);
    }

    public TipTransport tipTransport() {
        return TipTransport.USCAT;
    }
}
