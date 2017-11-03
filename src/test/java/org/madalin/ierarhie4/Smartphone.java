package org.madalin.ierarhie4;

public class Smartphone extends TelefonMobil {

    private boolean OS=true;
    private boolean display=true;
    private int diagonala;
    private int memRam;
    private boolean baterie=true;

    public Smartphone(int numar, String denumire, String tehnologie, boolean cuFir, String caracteristiciSpeciale) {
        super(numar, denumire, tehnologie, cuFir, caracteristiciSpeciale);
    }
}
