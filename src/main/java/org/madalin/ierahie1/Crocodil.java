package org.madalin.ierahie1;

public class Crocodil extends Reptila {

    private int lungime;

    public Crocodil(int lungime,  int varsta) {
        super(true, TipMancare.CARNE, 4, varsta);
        this.lungime=lungime;
    }



    public int getLungime() {
        return lungime;
    }

    public void setLungime(int lungime) {
        this.lungime = lungime;
    }

    @Override
    public String toString() {
        return "Crocodil{" +
                "lungime=" + lungime +
                '}';
    }
}
