package org.madalin.ierarhie;

public class RaftdeCarti extends Carte {

    private final int nrRaft=20;
    public RaftdeCarti() {
        this(400,"neclasificat" ,"A4" ,"maro" ,"cartonata" );
    }

    private RaftdeCarti(int nrPagina, String continut, String formatPagina, String culoare, String coperta) {
        super(nrPagina, continut, formatPagina, culoare, coperta);

    }

}
