package org.madalin.ierarhie4;

public class TelefonMobil extends TelefonCuFir {

    private final boolean nuAreFir=true;
    private final boolean sistemOperare=false;
    public TelefonMobil(int numar, String denumire, String tehnologie, boolean cuFir, String caracteristiciSpeciale) {
        super(numar, denumire, tehnologie, cuFir, caracteristiciSpeciale);


    }


    @Override
    public void poateApela() {
        super.poateApela(); //? ?
    }
}
