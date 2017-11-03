package org.madalin.ierarhie2;

public class Autocamion extends Automobil {
    private boolean remorca;

    public Autocamion() {

        super( TipCarburant.MOTORINA, nrRoti,durataDeViata,nrRoti,nrUsi);
        this.remorca = remorca;

    }



    private boolean transportaMarfa(){
        return remorca;
    }


}
