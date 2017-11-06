package org.madalin.ierarhie2;

public class AutovehiculeMaritime extends VehiculeAutopropulsate {
    public AutovehiculeMaritime(int culoare, int nrLocuri, double vitezaMaxima) {
        super(culoare, nrLocuri, vitezaMaxima);
    }


    public TipTransport tipTransport() {
        return TipTransport.APA;
    }

}



