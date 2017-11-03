package org.madalin.ierarhie2;

import static org.madalin.ierarhie2.TipCarburant.*;

 public class Autotren extends Autocamion {

     private final String remorciSpeciale;

     public Autotren(TipCarburant motorina, int i, String culoare) {
         super(TipCarburant.MOTORINA, int nrRoti,String culoare);
         this.culoare=culoare;
     }

     protected boolean remorciSpeciale(){
        return false;

     }

     public Autotren(String remorciSpeciale, float tonaj) {

         super( TipCarburant.MOTORINA, nrRoti :6 , tonaj);


    }


 }




