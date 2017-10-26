package org.madalin.ierarhie4;

public class PC extends CalculatorMecanic {
     protected String mc;

     protected void interpreataza(){
         System.out.println("orice pc poate interpreta un cod");
     }

     protected  double calculeazaRadical (int numar){

         double  radical = Math.sqrt(numar);
         return radical;
     }
}

