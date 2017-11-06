package org.madalin.ierarhie2;

public abstract class AutovehiculeAeriene extends VehiculeAutopropulsate {
    private final TipDecolare tipDecolare;
    private final boolean pilotat;

    public AutovehiculeAeriene(int culoare, int nrLocuri, double vitezaMaxima, TipDecolare tipDecolare, boolean pilotat, TipCarburant kerosen) {
        super(culoare, nrLocuri, vitezaMaxima,TipCarburant.KEROSEN);
        this.tipDecolare = tipDecolare;
        this.pilotat = pilotat;
    }

    public TipTransport tipTransport() {
        return TipTransport.AER;
    }

    public TipDecolare getTipDecolare() {
        return tipDecolare;
    }

    public boolean isPilotat() {
        return pilotat;
    }

    public TipCarburant tipCarburant
            () {
        return TipCarburant.KEROSEN;}
    }

