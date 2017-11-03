package org.madalin.ierarhie4;

public class Telefon {

    protected int numar;
    protected String denumire;
    protected String tehnologie;
    protected boolean cuFir;

    public Telefon(int numar, String denumire, String tehnologie, boolean cuFir){
        this.numar=numar;
        this.denumire=denumire;
        this.tehnologie=tehnologie;
        this.cuFir=cuFir;
    }

    public void poateApela(){
        System.out.println("Orice telefon poate apela");
    }

}
