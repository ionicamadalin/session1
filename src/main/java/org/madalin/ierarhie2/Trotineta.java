package org.madalin.ierarhie2;

public class Trotineta extends VehiculeSemiPropulsate {
    public Trotineta(int culoare) {
        super(culoare, 1, 15);
    }

    public TipTransport tipTransport() {
        return TipTransport.USCAT;
    }
}
