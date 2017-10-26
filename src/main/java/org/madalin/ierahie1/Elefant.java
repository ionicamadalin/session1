package org.madalin.ierahie1;

public class Elefant extends Mamifer {


    public Elefant(int varsta, Sex sex) {
        super(TipMancare.IARBA, 4, varsta, sex);
    }


    public TipVedere tipVedere() {
        return TipVedere.LATERALA;
    }
}
