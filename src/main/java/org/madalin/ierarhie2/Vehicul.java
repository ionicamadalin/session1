package org.madalin.ierarhie2;

public abstract class Vehicul {

    private final int culoare;
    private final int nrLocuri;
    private final double vitezaMaxima;


    public Vehicul(int culoare, int nrLocuri, double vitezaMaxima) {
        this.culoare = culoare;
        this.nrLocuri = nrLocuri;
        this.vitezaMaxima = vitezaMaxima;

    }

    public int getCuloare() {
        return culoare;
    }



    public int getNrLocuri() {
        return nrLocuri;
    }


    public double getVitezaMaxima() {
        return vitezaMaxima;
    }


    protected abstract boolean areMotor();

    public abstract TipTransport tipTransport();
    public abstract TipCarburant tipCarburant();




}
