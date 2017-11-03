package org.madalin.ierarhie2;

public class AutovehiculTransoportUscat extends VehiculeAutopropulsate {


    public AutovehiculTransoportUscat(int culoare, int nrLocuri, double vitezaMaxima, TipTransport tipTransport) {
        super(culoare, nrLocuri, vitezaMaxima);
    }

    public TipTransport tipTransport() {
        return TipTransport.USCAT;
    }
}
