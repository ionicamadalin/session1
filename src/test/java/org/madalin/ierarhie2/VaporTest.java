package org.madalin.ierarhie2;

import org.junit.Test;



public class VaporTest {
    private Vehicul vehicul;
    @Test
    public void creaza() throws Exception {
        vehicul=new Vapor(Culoare.GALBEN.getCod(),300,210,TipNavigare.SUPRAFATA,100000,true);
        print(vehicul);
        vehicul=new BarcaCuMotor(Culoare.GALBEN.getCod(),2,20,TipNavigare.SUPRAFATA,100,true);
        print(vehicul);
        vehicul=new Drona(Culoare.GALBEN.getCod(),0,50);
        print(vehicul);
        vehicul = new Trotineta(Culoare.VERDE.getCod());
        print(vehicul);

    };
    private void print(Vehicul vehicul){
        System.out.print("\n"+vehicul.getClass().getSimpleName() + " are motor? "+vehicul.areMotor() );
        System.out.print(", culoare: "+Culoare.get(vehicul.getCuloare()).name().toLowerCase() );
        System.out.print(", nr locuri: "+ vehicul.getNrLocuri() );
        System.out.print(", viteza maxima? "+ vehicul.getVitezaMaxima()+" km/h" );
        System.out.print(", ce tip de transport are? "+ vehicul.tipTransport() );

    }



}