package org.madalin.ierarhie3;

import org.junit.Test;



public class DispozitivDeComunicareTest {

    private DispozitivDeComunicare dispozitivDeComunicare;
    @Test
    public void creaza() throws Exception {

        dispozitivDeComunicare = new Goarna("ROSU", 20, true,90);
        print(dispozitivDeComunicare);

    }

    private void print(DispozitivDeComunicare dispozitivDeComunicare) {
        System.out.println("\n" + dispozitivDeComunicare.getClass().getSimpleName() +" " +"este electric ?" +" "+ dispozitivDeComunicare.esteElectric());
        System.out.println("Ce culoare are ? " +" " +dispozitivDeComunicare.getCuloare().toUpperCase()+" ");
        System.out.println("ce dimensiuni are ?"+" "+ dispozitivDeComunicare.getDimensiune()+" " + "cm");
        System.out.println("este portabil ?"+ " " + dispozitivDeComunicare.isPortabilitate()+" ");
        System.out.println("este electric ?"+" "+dispozitivDeComunicare.esteElectric());
        System.out.println("ce capacitate are ?"+" "+dispozitivDeComunicare.getCapacitateDb()+" "+"dB");
    }
}
