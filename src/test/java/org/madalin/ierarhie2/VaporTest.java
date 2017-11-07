package org.madalin.ierarhie2;

import org.junit.Test;



public class VaporTest {
    private Vehicul vehicul;
    @Test
    public void creaza() throws Exception {
        vehicul=new Vapor(Culoare.GALBEN.getCod(),300,210,TipNavigare.SUPRAFATA,100000,true);
        print(vehicul);
        vehicul=new BarcaCuMotor(Culoare.GALBEN.getCod(),2,20,TipNavigare.SUPRAFATA,100,true,TipCarburant.MOTORINA);
        print(vehicul);
        vehicul=new Drona(Culoare.GALBEN.getCod(),0,50);
        print(vehicul);
        vehicul = new Trotineta(Culoare.VERDE.getCod());
        print(vehicul);
        vehicul = new Bicicleta(Culoare.VERDE.getCod(),2,60);
        print(vehicul);
        vehicul = new Elicopter(Culoare.VERDE.getCod(),2,150);
        print(vehicul);
        vehicul= new Masina(Culoare.ROSU.getCod(),2,220,true);
        print(vehicul);
        vehicul= new Autocamion(Culoare.VERDE.getCod(),4,110,true);
        print(vehicul);
        vehicul= new Avion(Culoare.VERDE.getCod(),320, 540,TipCarburant.KEROSEN);
        print(vehicul);
        vehicul= new Tricicleta(Culoare.VERDE.getCod(),1,23,true,true);
        print(vehicul);

    };
    private void print(Vehicul vehicul){
        System.out.print("\n"+vehicul.getClass().getSimpleName() + " are motor? "+vehicul.areMotor() );
        System.out.print(", culoare: "+Culoare.get(vehicul.getCuloare()).name().toLowerCase() );
        System.out.print(", nr locuri: "+ vehicul.getNrLocuri() );
        System.out.print(", viteza maxima? "+ vehicul.getVitezaMaxima()+" km/h" );
        System.out.print(", ce tip de transport are? "+ vehicul.tipTransport() );
        System.out.print(", ce tip de carburant foloseste? "+ vehicul.tipCarburant()+" "+ "Adevaratttt" );

    }



}