package org.madalin.ierarhie4;

public class TelefonCuFir extends Telefon {

    private String caracteristiciSpeciale;



    public TelefonCuFir(int numar, String denumire, String tehnologie, boolean cuFir,String caracteristiciSpeciale) {
        super(numar, denumire, tehnologie, cuFir);
        this.caracteristiciSpeciale=caracteristiciSpeciale;
    }



    @Override
    public void poateApela() {
        super.poateApela();  // si daca eu vreau sa faca altceva, cum pot sa scriu asta ??
    }
}
