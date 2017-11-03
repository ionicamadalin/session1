package org.madalin.ierarhie2;

public abstract class Autovehicul {





        // ce carburant consuma un atomobil
        private TipCarburant tipCarburant;
        private int nrRoti;
        private int durataDeViata;
        private int nrUsi;
        private String normaPoluare;
        private float tonaj;



        public  Autovehicul(TipCarburant tipCarburant, int nrRoti, int durataDeViata, int nrUsi, float tonaj){
            this.tipCarburant=tipCarburant;
            this.nrRoti=nrRoti;
            this.durataDeViata=durataDeViata;
            this.nrUsi=nrUsi;
            this.tonaj=tonaj;
        }

        public final boolean polueazaMult (){

            return tipCarburant==TipCarburant.MOTORINA;
        }
        public void Caroserie(){
            System.out.println("Orice masina are o caroserie");
        }

    }


}
