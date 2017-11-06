package org.madalin.ierarhie2;

public class AutovehiculeMaritime extends VehiculeAutopropulsate {
    public AutovehiculeMaritime(int culoare, int nrLocuri, double vitezaMaxima,TipCarburant tipCarburant) {
        super(culoare, nrLocuri, vitezaMaxima,TipCarburant.MOTORINA);
    }


    public TipTransport tipTransport() {
        return TipTransport.APA;
    }

    public TipCarburant tipCarburant(){return  TipCarburant.MOTORINA;}

}



