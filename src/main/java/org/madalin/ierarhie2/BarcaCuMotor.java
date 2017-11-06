package org.madalin.ierarhie2;

public class BarcaCuMotor extends AutovehiculeMartimieDeSuprafataUsoare {
    private final boolean vasle;




    public BarcaCuMotor(int culoare, int nrLocuri, double vitezaMaxima, TipNavigare tipNavigare, int greutate, boolean vasle) {
        super(culoare, nrLocuri=2, vitezaMaxima=15, tipNavigare.SUPRAFATA, greutate);
        this.vasle=vasle;

    }

    public boolean isVasle() {
        return vasle;
    }
}
