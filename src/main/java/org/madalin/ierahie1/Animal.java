package org.madalin.ierahie1;

public abstract class Animal {
    // ce manaca un animal (iarba sau carne)
    private TipMancare tipMancare;

    // numarul de picioare
    private int nrPicioare;

    private int varsta;

    //sexul
    private Sex sex;

    public Animal(TipMancare tipMancare, int nrPicioare, int varsta, Sex sex) {
        this.tipMancare = tipMancare;
        this.nrPicioare = nrPicioare;
        this.varsta = varsta;
        this.sex = sex;
    }



    public final boolean seReproduce(){
        return this.sex!=Sex.A;
    }

    public final boolean esteCarnivor(){
        return tipMancare==TipMancare.CARNE;
    }

    public abstract TipVedere tipVedere();
}
