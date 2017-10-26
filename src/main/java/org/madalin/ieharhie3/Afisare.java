package org.madalin.ieharhie3;

public class Afisare{

    public static void main(String [] args){
        Smartphone Samsung = new Smartphone();
        Smartwatch Apple = new Smartwatch();

        Samsung.acceseazaInternet();
        Samsung.numar=12324;

        Apple.interfataSpeciala="Apple OS";
        Apple.afiseaza();
        Apple.suna();

    }


}
