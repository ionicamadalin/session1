package org.madalin.ierarhie2;

import org.junit.Test;

public class AutovehiculTest {
    @Test
    public void polueazaMult() throws Exception {
    }
  private Autovehicul[] autovehicles;
    @Test
    public void creaza() throws Exception {

        autovehicles=new Autovehicul[]{
                new Autocamion(),
                new Automobil(4,1),
                new Autotren(TipCarburant.MOTORINA, 10, "galben " );


                }
        }
    }

}