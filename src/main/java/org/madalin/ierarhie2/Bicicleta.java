package org.madalin.ierarhie2;

public class Bicicleta extends VehiculeSemiPropulsate {
    public Bicicleta(int culoare, int nrLocuri, double vitezaMaxima) {
        super(culoare, nrLocuri, vitezaMaxima, TipCarburant.FORTAUMANA);
    }

    public TipTransport tipTransport() {

        return TipTransport.USCAT;
    }


}
