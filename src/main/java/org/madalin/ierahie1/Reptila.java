package org.madalin.ierahie1;

public abstract class Reptila extends Animal {

    private final boolean coada;


    public Reptila(boolean coada,TipMancare tipMancare, int nrPicioare, int varsta) {
        super(tipMancare, nrPicioare, varsta, Sex.A);
        this.coada = coada;
    }

    public boolean isCoada() {
        return coada;
    }

    @Override
    public final TipVedere tipVedere() {
        return TipVedere.LATERALA;
    }
}
