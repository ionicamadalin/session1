package org.madalin.ierarhie2;

public class Tricicleta extends Bicicleta {
    private final boolean roataSuplimentara;
    private final boolean pentruCopii;



    public Tricicleta(int culoare, int nrLocuri, double vitezaMaxima, boolean roataSuplimentara, boolean pentruCopii) {

        super(culoare, nrLocuri, vitezaMaxima);
        this.roataSuplimentara=roataSuplimentara;
        this.pentruCopii=pentruCopii;

    }

    public boolean isRoataSuplimentara() {
        return true;
    }
    public boolean isPentruCopii() {
        return true;
    }

}
