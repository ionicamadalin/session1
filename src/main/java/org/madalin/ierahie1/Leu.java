package org.madalin.ierahie1;

public class Leu extends Mamifer {

    public Leu(int varsta, Sex sex) {
        super(TipMancare.CARNE, 4, varsta, sex);
    }

    public TipVedere tipVedere() {
        return TipVedere.IN_FATA;
    }
}
