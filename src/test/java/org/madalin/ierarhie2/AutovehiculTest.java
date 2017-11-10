package org.madalin.ierarhie2;

import org.junit.Test;

public class AutovehiculTest {
    /*@Test
   *//* public void polueazaMult() throws Exception {
    }*/
    private Vehicul vehicul;
    @Test
    public void creaza() throws Exception {

        vehicul=new Drona(Culoare.GALBEN.getCod(),0,50);
        print(vehicul);
        vehicul = new Trotineta(Culoare.VERDE.getCod());
        print(vehicul);
    }

    private void print(Vehicul vehicul){
        System.out.print("\n"+vehicul.getClass().getSimpleName() + " are motor? "+vehicul.areMotor() );
        System.out.print(", culoare: "+Culoare.get(vehicul.getCuloare()).name().toLowerCase() );
        System.out.print(", nr locuri: "+ vehicul.getNrLocuri() );

    }

}
