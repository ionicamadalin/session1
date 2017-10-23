package org.madalin.ierarhie2;

public class Bicicleta extends Vehicul implements VehiculcuRoti {

    protected final String spite;
    protected String nume;

    Bicicleta(String spite){  // constructor
        this.spite=spite;
    }
    public void mergepestrada() {

    }

    public void mergepedrum() {

    }

    public void claxoneaza(){  // suprascriere ?

        System.out.println("O bicicleta poate sa aiba un claxon");
    }

}

