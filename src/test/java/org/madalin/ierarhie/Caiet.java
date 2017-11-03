package org.madalin.ierarhie;

public class Caiet extends Pagina {

    private  int nrCapitol;
    private String culoare;
    public Caiet(int nrPagina, String continut, String formatPagina, String culoare) {

        super(nrPagina, continut, formatPagina);
        this.culoare=culoare;
    }


    public Caiet(String culoare, int nrCapitol) {
        this.culoare=culoare;
        this.nrCapitol=nrCapitol;
    }
}
