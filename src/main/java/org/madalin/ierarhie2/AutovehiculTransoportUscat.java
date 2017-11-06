package org.madalin.ierarhie2;

public class AutovehiculTransoportUscat extends VehiculeAutopropulsate {


    public AutovehiculTransoportUscat(int culoare, int nrLocuri, double vitezaMaxima, TipTransport tipTransport) {
        super(culoare, nrLocuri, vitezaMaxima, TipCarburant.BENZINA);
    }

    public TipTransport tipTransport() {
        return TipTransport.USCAT;
    }

    @Override
    public TipCarburant tipCarburant() {
        return tipCarburant();
    }
}
