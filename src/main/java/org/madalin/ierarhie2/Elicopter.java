package org.madalin.ierarhie2;

public class Elicopter extends AutovehiculeAeriene {
    public Elicopter(int culoare, int nrLocuri, double vitezaMaxima) {
        super(culoare, nrLocuri, vitezaMaxima, TipDecolare.PUNCT_FIX, true, TipCarburant.KEROSEN);
    }



}