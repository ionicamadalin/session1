package org.madalin.ierarhie5;

public class CircuitSimplu extends Tranzistor {

    private boolean alimenteaza=true;
    private boolean defecte=false;
    protected String curentDeBaza;

    public CircuitSimplu(String crtBaza, String crtColector, String crtEmitor, int numar) {
        super(crtBaza, crtColector, crtEmitor, numar);
        curentDeBaza = "24";
    }
}
