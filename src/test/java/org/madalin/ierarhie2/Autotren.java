package org.madalin.ierarhie2;

import static org.madalin.ierarhie2.TipCarburant.*;

 public class Autotren extends Autocamion {

     private final String remorciSpeciale="au";

     public Autotren(TipCarburant motorina, String culoare) {
         super(TipCarburant.MOTORINA,int nrRoti,String culoare,String remorciSpeciale);
         this.remorciSpeciale=remorciSpeciale;

     }


     public Autotren(String remorciSpeciale, float tonaj) {

         super( TipCarburant.MOTORINA, nrRoti :6 , tonaj);


    }


 }




