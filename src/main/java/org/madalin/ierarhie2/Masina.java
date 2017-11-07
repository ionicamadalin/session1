package org.madalin.ierarhie2;

public class Masina extends AutovehiculTransoportUscat {
    private final boolean dimensiuneRedusa;
    public Masina(int culoare, int nrLocuri, double vitezaMaxima, boolean dimensiuneRedusa) {
        super(culoare, nrLocuri, vitezaMaxima,TipTransport.USCAT);
        this.dimensiuneRedusa=dimensiuneRedusa;
    }

    public boolean isDimensiuneRedusa() {
        return dimensiuneRedusa;
    }

}
