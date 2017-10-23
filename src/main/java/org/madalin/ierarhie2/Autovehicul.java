package org.madalin.ierarhie2;

public class Autovehicul extends Vehicul implements VehiculcuRoti {
    protected String caroserie = "de metal";
    public void seAlimenteaza(){
        System.out.println("un autovehicul se alimenteaza");
    }

    public void seDeplaseaza(){

        System.out.println("Autovehiculul se deplaseaza mai repede");  //suprascriere
    }

    public void mergepestrada() {

    }

    public void mergepedrum() {

    }


}
