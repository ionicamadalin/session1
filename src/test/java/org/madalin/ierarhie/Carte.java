package org.madalin.ierarhie;

public class Carte extends Caiet {
    private String coperta = "Are o coperta";

    public Carte(int nrPagina, String continut, String formatPagina, String culoare, String coperta) {
        super(nrPagina, continut, formatPagina, culoare);
        this.coperta = coperta;
    }
}


