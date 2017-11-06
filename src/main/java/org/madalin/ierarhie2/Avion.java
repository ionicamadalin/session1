package org.madalin.ierarhie2;

public class Avion extends AutovehiculeAeriene {


    public Avion(int culoare, int nrLocuri, double vitezaMaxima,TipCarburant tipCarburant) {
        super(culoare, nrLocuri, vitezaMaxima, TipDecolare.PISTA,true, TipCarburant.KEROSEN);
    }



}
